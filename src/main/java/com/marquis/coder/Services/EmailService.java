package com.marquis.coder.Services;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender; 
import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class EmailService {


   @Autowired 
   private final JavaMailSender javaMailSender;

   void sendEmail(String to, String subject, String text){
        SimpleMailMessage mailMessage = new SimpleMailMessage();
        mailMessage.setTo(to);
        mailMessage.setSubject(subject);
        mailMessage.setText(text);
        mailMessage.setFrom("deshawn.m.williams01@gmail.com");
        javaMailSender.send(mailMessage);
   }
}
