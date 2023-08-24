package com.marquis.coder.Configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebApplicationConfiguration implements WebMvcConfigurer{

    @Override
    public void addViewController(ViewControllerRegistry registry){
        registry.addViewController("/404").setViewName();
    }    
}
