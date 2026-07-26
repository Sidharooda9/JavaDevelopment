package com.example.accounts.mapper;

import com.example.accounts.dto.AccountsDto;
import com.example.accounts.dto.CustomerDto;
import com.example.accounts.entity.Accounts;
import com.example.accounts.entity.Customer;

public class CustomerMapper {
    public static CustomerDto mapToCustomerDTO(Customer customer , CustomerDto customerDto){
        customerDto.setName(customer.getName());
        customerDto.setEmail(customer.getEmail());
        customerDto.setMobileNumber(customer.getMobileNumber());
        return customerDto;

    }
    public static Customer mapToCustomer(Customer customer , CustomerDto customerDto){
        customer.setName(customerDto.getName());
        customer.setEmail(customerDto.getEmail());
        customer.setMobileNumber(customerDto.getMobileNumber());
        return customer;

    }
    public static Accounts mapToAccount(Accounts accounts , AccountsDto accountsDto){
        accounts.setAccountType(accountsDto.getAccountType());
        accounts.setAccountNumber(accountsDto.getAccountNumber());
        accounts.setBranchAddress(accountsDto.getBranchAddress());
        return accounts;

    }
    public static AccountsDto mapToAccountDTO(Accounts accounts , AccountsDto accountsDto){
        accountsDto.setAccountType(accounts.getAccountType());
        accountsDto.setAccountNumber(accounts.getAccountNumber());
        accountsDto.setBranchAddress(accounts.getBranchAddress());
        return accountsDto;

    }
}
