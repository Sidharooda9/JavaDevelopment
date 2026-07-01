package com.example.accounts.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountController {

    @GetMapping("sayhello")
    public String sayHello(){
        System.out.println("siddu");
        System.out.println("Ok");
        return "Hello World";
    }
}
