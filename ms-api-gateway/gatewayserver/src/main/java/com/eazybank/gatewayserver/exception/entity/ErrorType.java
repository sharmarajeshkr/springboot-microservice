package com.eazybank.gatewayserver.exception.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ErrorType {

    private String message;
    private String code;
    private String error;
    private String status;
}
