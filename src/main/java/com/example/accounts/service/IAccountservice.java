package com.example.accounts.service;

import com.example.accounts.dto.CustomerDto;

public interface IAccountservice {
    public void createAccount(CustomerDto customerDto);
    public CustomerDto fetchAccount(String mobileNum);
    public boolean updateAaccountDetails(CustomerDto customerDto);

    boolean deleteAccountDetails(String mobileNum);
}
