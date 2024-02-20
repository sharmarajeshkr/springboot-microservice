package com.eazybank.gatewayserver.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.server.ResponseStatusException;

@ResponseStatus(code = HttpStatus.NOT_FOUND)
public class RouteURINotExistException extends ResponseStatusException {
    private static final long serialVersionUID = 1L;

    public RouteURINotExistException(HttpStatusCode status) {
        super(status);
    }

    public RouteURINotExistException(HttpStatusCode status, String reason) {
        super(status, reason);
    }
}
