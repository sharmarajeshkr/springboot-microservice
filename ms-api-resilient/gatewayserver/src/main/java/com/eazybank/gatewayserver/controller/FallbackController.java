package com.eazybank.gatewayserver.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import reactor.core.publisher.Mono;

@RequestMapping
public class FallbackController {

    @GetMapping("/contactSupport")
    public Mono<String> accountFallback(){
        return Mono.just("An error occurred. Please try after some time or contact support team!!!");
    }
}
