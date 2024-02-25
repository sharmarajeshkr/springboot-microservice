package com.eazybank.gatewayserver.configration;

import com.eazybank.gatewayserver.constant.ConfigConstant;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.Optional;

@Configuration
public class RouteLocatorConfiguration {
    @Bean
    public RouteLocator customRouteLocator(RouteLocatorBuilder builder) {

        return builder.routes()
                // Route For Account MS
                .route(p -> p.path("/eazybank/accounts/**")
                        .filters(f -> f.rewritePath("/eazybank/accounts/(?<segment>.*)", "/${segment}")
                                .addRequestHeader("X-Response-Time", LocalDateTime.now().toString())
                                // Circuit Breaker
                                .circuitBreaker(config -> config.setName(String.valueOf(ConfigConstant.ACCOUNTCIRCUTBREAKER))
                                        .setFallbackUri("forward:/contactSupport"))

                        )
                        .uri("lb://ACCOUNTS")
                )
                // Route For Loans MS
                .route(p -> p.path("/eazybank/loans/**")
                        .filters(f -> f.rewritePath("/eazybank/loans/(?<segment>.*)", "/${segment}")
                                .addRequestHeader("X-Response-Time", LocalDateTime.now().toString())
                                // Retry
                                /*.retry(retryConfig -> retryConfig.setRetries(3).setMethods(HttpMethod.GET)
                                        .setBackoff(Duration.ofMillis(100), Duration.ofMillis(1000), 2, true)
                                )*/
                        )
                        .uri("lb://LOANS")
                )
                // Route For Cards MS
                .route(p -> p.path("/eazybank/cards/**")
                        .filters(f -> f.rewritePath("/eazybank/cards/(?<segment>.*)", "/${segment}")
                                .addRequestHeader("X-Response-Time", LocalDateTime.now().toString())
                        )
                        .uri("lb://CARDS")
                )

                .build();
        /*} catch ( Exception exception) {
            throw new RouteURINotExistException("Invalid URI");
        }*/
    }
}
