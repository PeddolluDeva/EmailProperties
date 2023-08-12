package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
@SpringBootApplication
public class SpringEmailApplication {
	@Autowired
	private EmailSenderService senderService;
	//private String subject ;
	//private String toEmail ;
	//private String body;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringEmailApplication.class, args);
	}
	@EventListener(ApplicationReadyEvent.class)
	public  void sendMail() {
	//	String toEmail;
		senderService.sendEmail("peddolludeva803@gmail.com","Git Hub  :-  https://github.com/PeddolluDeva ","Git Hub Acces token :- \"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 \"+https://github.com/PeddolluDeva/VScode"
				);
		
		//senderService.sendEmail(toEmail:"peddolladevanjineyulu@gmail.com",subject:"These is Subject",body:"love you Body");
	}
}
