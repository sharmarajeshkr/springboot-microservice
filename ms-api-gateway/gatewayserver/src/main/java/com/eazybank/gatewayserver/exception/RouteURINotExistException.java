package com.eazybank.gatewayserver.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code= HttpStatus.NOT_FOUND)
public class RouteURINotExistException extends RuntimeException {
    private static final long serialVersionUID = 1L;

    public RouteURINotExistException() {
        super();
    }

    public RouteURINotExistException(String errorMessage) {
        super(errorMessage);
    }
}
