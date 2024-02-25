package com.eazybank.accounts.service.client;

import com.eazybank.accounts.dto.LoansDto;
import com.eazybank.accounts.service.fallbackmethods.LoansFallback;
import io.github.resilience4j.retry.annotation.Retry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;


@FeignClient(value = "loans", fallback = LoansFallback.class)
//@Retry(name = "retryLoansDetails", fallbackMethod = "fallbackFetchLoansDetails")
public interface LoansFeignClient {
    Logger logger = LoggerFactory.getLogger(LoansFeignClient.class);

    @GetMapping(value = "/api/fetch", consumes = "application/json")
    public ResponseEntity<LoansDto> fetchLoanDetails(
            @RequestHeader("eazybank-correlation-id") String correlationId,
            @RequestParam String mobileNumber);

    private ResponseEntity<String> fetchLoanDetailsFallback(String correlationId, String mobileNumber, Throwable throwable) {
        logger.debug("Retry After some time");
        return ResponseEntity.status(HttpStatus.OK).body("PLS Try After some time");

    }

}
