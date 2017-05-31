package com.example.demo;

import config.MyAppConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import types.User;

@EnableConfigurationProperties
@ComponentScan({"com.example.com", "services", "controller", "config"})
@SpringBootApplication
public class DemoApplication {

	@Bean
	public User user() {
		return new User("Kuk", "Skalle");
	}

	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(DemoApplication.class, args);

		MyAppConfig config = (MyAppConfig) applicationContext.getBean("myAppConfig");

		System.out.println(config.toString());
	}
}
