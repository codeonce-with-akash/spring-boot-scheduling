package com.boot.scheduling.cron.report;

import java.util.Date;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/*
 * CRON expression is 6* expression
 * 
 * 	|	*	seconds of the minute(0-59)					
 * 	|	*	minute of the hour(0-59)				
 * 	|	*	hour of the day(0-23)				
 * 	|	*	date of the month(1-31)				
 * 	|	*	month of the year(1-12)				
 * 	|	*	week day name(SUN-SAT)
 */																							

@Component("report")
public class ReportGenerator {
	//@Scheduled(cron = "10 * * * * *")		// task will execute every 10th second of every minute
	//@Scheduled(cron = "1 2 20 * * *")		// task will execute every day at 8pm 2min 1sec
	//@Scheduled(cron = "0 2 8,10 * * *")	// task will execute every day at 8:02am and 10:02am
	//@Scheduled(cron = "10 20 9-13 * * *")	// task will execute every day at 9:20:10am, 10:20:10am, 11:20:10am, 12:20:10pm, 13:20:10pm 
	//@Scheduled(cron = "0 20 22 12 * *")	// task will execute every month 12 date at 10:20:00pm
	@Scheduled(cron = "0 0 22 * * *")		// task will execute every day at 10pm
	public void generateSalesReport() {
		System.out.println("Generate sales report at: "+new Date());
	}
}
