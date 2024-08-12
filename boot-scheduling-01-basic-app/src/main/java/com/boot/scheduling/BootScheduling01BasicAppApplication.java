package com.boot.scheduling;

import java.util.Date;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class BootScheduling01BasicAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(BootScheduling01BasicAppApplication.class, args);
		System.out.println("Application Started At : " + new Date());
		System.out.println("Main Thread Hashcode : " + Thread.currentThread().hashCode());
		System.out.println("---------------------------------------------------------");
	}

}
