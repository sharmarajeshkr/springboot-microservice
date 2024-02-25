package com.eazybank.accounts.service.client;

import com.eazybank.accounts.dto.CardsDto;
import com.eazybank.accounts.service.fallbackmethods.CardsFallback;
import io.github.resilience4j.retry.annotation.Retry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "cards", fallback = CardsFallback.class)
// @Retry(name = "retryCardDetails", fallbackMethod = "fetchCardDetailsFallback")
public interface CardsFeignClient {
    Logger logger = LoggerFactory.getLogger(CardsFeignClient.class);

    @GetMapping(value = "/api/fetch", consumes = "application/json")
    public ResponseEntity<CardsDto> fetchCardDetails(
            @RequestHeader("eazybank-correlation-id") String correlationId,
            @RequestParam String mobileNumber);

    // fetchCardDetailsFallback(class java.lang.String,class java.lang.String,class java.lang.Throwable)
    private ResponseEntity<String> fetchCardDetailsFallback(String correlationId, String mobileNumber, Throwable throwable) {
        logger.debug("Retry After some time");
        return ResponseEntity.status(HttpStatus.OK).body("PLS Try After some time");
    }
}
