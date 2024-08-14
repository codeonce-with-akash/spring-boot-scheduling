package com.boot.scheduling;

import java.util.Date;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class BootScheduling02CronExpressionApplication {

	public static void main(String[] args) {
		SpringApplication.run(BootScheduling02CronExpressionApplication.class, args);
		System.out.println("Application started on : " + new Date());
	}

}
