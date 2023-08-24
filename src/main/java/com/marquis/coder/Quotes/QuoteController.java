package com.marquis.coder.Quotes;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class QuoteController {

    @GetMapping("/quote")
    public static String quotes(){
        return "quote";
    }
}
