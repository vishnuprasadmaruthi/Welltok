package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;

import com.example.controller.BookController;

@SpringBootApplication
@ComponentScan(basePackageClasses = BookController.class)

public class BookProjectApplication extends SpringBootServletInitializer{

	public static void main(String[] args) {
		SpringApplication.run(BookProjectApplication.class, args);
	}
	
}
