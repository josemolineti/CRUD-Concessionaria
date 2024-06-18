package com.fag.concessionaria;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.fag.concessionaria")
public class ConcessionariaApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(ConcessionariaApplication.class, args);
		context.getEnvironment();
		
	}

}
