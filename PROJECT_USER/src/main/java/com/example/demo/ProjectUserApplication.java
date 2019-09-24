package com.example.demo;

import java.io.IOException;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;
import org.springframework.core.io.ClassPathResource;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication
@EnableDiscoveryClient
public class ProjectUserApplication {
	
//	 @Autowired
//	 private JavaMailSender javaMailSender;

	public static void main(String[] args) {
		SpringApplication.run(ProjectUserApplication.class, args);
	}

	
	@Bean
	public BCryptPasswordEncoder bCryptPasswordEncoder()
	{
		return new BCryptPasswordEncoder();
	}


//	@Override
//	public void run(String... args) throws MessagingException, IOException {
//		System.out.println("Sending Email...");
//		sendEmailWithAttachment();
//        System.out.println("Done");	
//	}
//

//	@Bean
//	private void sendEmailWithAttachment() throws MessagingException {
//		System.out.println("Sending Email...");
//		MimeMessage msg = javaMailSender.createMimeMessage();
//        MimeMessageHelper helper = new MimeMessageHelper(msg, true);
//        helper.setTo("chaurasia.smriti5@gmail.com");
//        helper.setSubject("Testing from Spring Boot");
//        helper.setText("<h1>Check attachment for image!</h1>", true);
//        helper.addAttachment("my_photo.png", new ClassPathResource("android.png"));
//        javaMailSender.send(msg);	
//        System.out.println("Done");	
//	}
}
