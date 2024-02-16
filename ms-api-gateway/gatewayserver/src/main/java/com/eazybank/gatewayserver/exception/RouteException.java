package com.eazybank.gatewayserver.exception;

import com.eazybank.gatewayserver.exception.entity.ErrorType;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class RouteException {
    @ExceptionHandler(RouteURINotExistException.class)
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
    }
}
