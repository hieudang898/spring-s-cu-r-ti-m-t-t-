package com.security.study.section1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CardController {
    @GetMapping("/myCard")
    public String getCardDetails(){
        return "card details from DB";
    }
}
