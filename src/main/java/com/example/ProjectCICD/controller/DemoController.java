package com.example.ProjectCICD.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @GetMapping("/api/demo")
    public String demo(@RequestParam String name) throws Exception {
        if(name.equalsIgnoreCase("fail")){
           throw new Exception("Failed");
        }else {
            return "unsuccessful";
        }
    }
}
