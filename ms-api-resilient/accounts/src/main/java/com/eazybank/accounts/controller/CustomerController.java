package com.eazybank.accounts.controller;

import com.eazybank.accounts.dto.CustomerDetailsDto;
import com.eazybank.accounts.dto.ErrorResponseDto;
import com.eazybank.accounts.service.ICustomerDetailsService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.constraints.Pattern;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@Tag(
        name = "CRUD REST APIs for Customer in EazyBank",
        description = "REST APIs in EazyBank to Fetch Customer details"
)
@RestController
@RequestMapping(path = "/api", produces = {MediaType.APPLICATION_JSON_VALUE})
@Validated
public class CustomerController {

    private final ICustomerDetailsService iCustomerDetailsService;

    public CustomerController(ICustomerDetailsService iCustomerDetailsService) {
        this.iCustomerDetailsService = iCustomerDetailsService;
    }

    private static final Logger logger = LoggerFactory.getLogger(CustomerController.class);

    @Operation(
            summary = "Fetch Customer Details REST API",
            description = "REST API to fetch Customer ,Account ,Cards and Loans details based on a mobile number"
    )
    @ApiResponses({
            @ApiResponse(
                    responseCode = "200",
                    description = "HTTP Status OK"
            ),
            @ApiResponse(
                    responseCode = "500",
                    description = "HTTP Status Internal Server Error",
                    content = @Content(
                            schema = @Schema(implementation = ErrorResponseDto.class)
                    )
            )
    }
    )
    @GetMapping("/fetchCustomerDetails")
    public ResponseEntity<CustomerDetailsDto> fetchCustomerDetails(
            @RequestHeader("eazybank-correlation-id") String correlationId,
            @RequestParam @Pattern(regexp = "(^$|[0-9]{10})", message = "Mobile number must be 10 digits") String mobileNumber) {
        logger.debug("eazybank-correlation-id found : {}" , correlationId);
        CustomerDetailsDto customerDetailsDto = iCustomerDetailsService.fetchCustomerDetails(correlationId, mobileNumber);
        return ResponseEntity.status(HttpStatus.OK).body(customerDetailsDto);

    }
}