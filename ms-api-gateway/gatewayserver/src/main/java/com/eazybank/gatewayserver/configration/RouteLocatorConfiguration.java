package com.eazybank.gatewayserver.configration;

import com.eazybank.gatewayserver.exception.RouteURINotExistException;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDateTime;
import java.util.Collections;

@Configuration
public class RouteLocatorConfiguration {
    @Bean
    public RouteLocator customRouteLocator(RouteLocatorBuilder builder) {

        try {
            return builder.routes()
                    // Route For Account MS
                    .route(p -> p.path("/eazybank/accounts/**")



                            .filters(f -> f.rewritePath("/eazybank/accounts/(?<segment>.*)", "/${segment}")
                                    .addRequestHeader("X-Response-Time", LocalDateTime.now().toString())
                            )
                            .uri("lb://ACCOUNTS")
                    )
                    // Route For Loans MS
                    .route(p -> p.path("/eazybank/loans/**")
                            .filters(f -> f.rewritePath("/eazybank/loans/(?<segment>.*)", "/${segment}")
                                    .addRequestHeader("X-Response-Time", LocalDateTime.now().toString())
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
        } catch ( Exception exception) {
            throw new RouteURINotExistException("Invalid URI");
        }
    }
}
