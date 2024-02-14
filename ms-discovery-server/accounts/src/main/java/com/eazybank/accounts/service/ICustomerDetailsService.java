package com.eazybank.accounts.service;

import com.eazybank.accounts.dto.CustomerDetailsDto;

public interface ICustomerDetailsService {

    /**
    *
    * @param mobileNumber - Input Mobile Number
    * @return Customer Details based on given Mobile Number
    */
    CustomerDetailsDto fetchCustomerDetails(String mobileNumber);
}
