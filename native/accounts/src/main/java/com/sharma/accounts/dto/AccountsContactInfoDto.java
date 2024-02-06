package com.sharma.accounts.dto;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

//@Component
@ConfigurationProperties(prefix = "accounts")
public record AccountsContactInfoDto(String message, Map<String, String> contactDetails, List<String> onCallSupport) {

}
