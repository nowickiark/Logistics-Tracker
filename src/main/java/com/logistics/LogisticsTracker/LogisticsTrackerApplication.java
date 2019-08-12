package com.logistics.LogisticsTracker;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories(basePackages = "com.logistics.LogisticsTracker.repository")
@SpringBootApplication
public class LogisticsTrackerApplication {

	public static void main(String[] args) {
		SpringApplication.run(LogisticsTrackerApplication.class, args);

	}
}



