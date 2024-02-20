package com.eazybank.accounts.service.client;

import com.eazybank.accounts.dto.CardsDto;
import com.eazybank.accounts.dto.LoansDto;
import com.eazybank.accounts.service.fallbackmethods.CardsFallback;
import com.eazybank.accounts.service.fallbackmethods.LoansFallback;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "loans", fallback = LoansFallback.class)
public interface LoansFeignClient {
    @GetMapping(value = "/api/fetch", consumes = "application/json")
    public ResponseEntity<LoansDto> fetchLoanDetails(
            @RequestHeader("eazybank-correlation-id") String correlationId,
            @RequestParam String mobileNumber);

}
