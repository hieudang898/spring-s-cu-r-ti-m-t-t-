package com.security.study.section1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoanController {
    @GetMapping("/myLoan")
    public String getLoanDetails(){
        return "loan details from DB";
    }
}
