package com.marquis.coder.Quotes;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class QuoteController {
    @GetMapping("/quotes")
    public static String quotes(){
        return "quotes";
    }
}
