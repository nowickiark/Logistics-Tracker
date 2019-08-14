package com.logistics.LogisticsTracker;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

//@EnableJpaRepositories(basePackages = "com.logistics.LogisticsTracker.userPackage.service2.repository")
@EnableJpaRepositories(basePackages = "com.logistics.LogisticsTracker.userPackage.repository")
@SpringBootApplication
public class LogisticsTrackerApplication {

	public static void main(String[] args) {
		SpringApplication.run(LogisticsTrackerApplication.class, args);

	}
}



