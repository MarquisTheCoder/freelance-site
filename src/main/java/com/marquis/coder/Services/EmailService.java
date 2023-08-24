package com.marquis.coder.Services;


import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender; 
import org.springframework.stereotype.Service;

@Service
public class EmailService {
   JavaMailSender mailSender;
   public EmailService(JavaMailSender mailSender) {
    this.mailSender = mailSender;
   }

   void sendMessage(String to, String subject, String text){
        SimpleMailMessage message = new SimpleMailMessage();
        message.setFrom("EMAIL");
   }
}
