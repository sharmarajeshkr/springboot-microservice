package com.eazybank.gatewayserver.exception;

import com.eazybank.gatewayserver.exception.entity.ErrorType;
import org.springframework.boot.web.reactive.error.ErrorAttributes;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.ErrorResponse;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.reactive.function.server.ServerResponse;
import org.springframework.web.reactive.result.method.annotation.ResponseEntityExceptionHandler;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

@RestControllerAdvice
public class RouteException extends ResponseEntityExceptionHandler {
    @ExceptionHandler(RouteURINotExistException.class)
    @ResponseBody
    public Mono<ServerResponse> handleIllegalState(ServerWebExchange exchange,
                                                   RouteURINotExistException exc) {
        exchange.getAttributes().putIfAbsent(ErrorAttributes.ERROR_ATTRIBUTE, exc);
        return ServerResponse.from(ErrorResponse.builder
                (exc,HttpStatus.FORBIDDEN,exc.getMessage())
                .build());
    }



/*
    @ResponseBody
    public ResponseEntity<ErrorType> handleInvoiceNotFoundException(
            RouteURINotExistException ine) {

        return new ResponseEntity<ErrorType>(
                new ErrorType(
                        ine.getMessage(),
                        "URI_NOT_FOUND",
                        "URL NOT FOUND",
                        "404"),
                HttpStatus.NOT_FOUND);
    }*/
}
