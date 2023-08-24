package com.marquis.coder.Quotes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.marquis.coder.Services.EmailService;

@Controller
public class QuoteController {

    @Autowired
    private EmailService emailService;
     
    @PostMapping("/quote")
    public String quotes(@RequestParam String email){

        emailService.sendEmail("deshawn.m.williams01@gmail.com", "New Client" , email);
        return "quote";
    }
}
