package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories(basePackages= {"com.learn.dao"}) // for repository scannings
@EntityScan(basePackages= {"com.learn.bean"}) // for entity scannings
@EnableAutoConfiguration
@SpringBootApplication(scanBasePackages = {"com.learn.bean","com.learn.controller","com.learn.dao","com.learn.services"})
public class TodoWebAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(TodoWebAppApplication.class, args);
		System.out.println("WEL COME TODO");
	}

}
