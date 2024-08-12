package com.boot.scheduling.cron.report;

import java.util.Date;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/*
 * CRON expression is 6* expression
 * 
 * 		*						*					*					*					*					*
 * 		|						|					|					|					|					|
 * 		seconds of the minute 	|					|					|					|					|
 * 		(0-59)					minute of the hour	|					|					|					|
 * 								(0-59)				hour of the day		|					|					|
 * 													(0-23)				date of the month	|					|
 * 																		(1-31)				month of the year	|
 * 																							(1-12)				week day name
 * 																												(SUN-SAT)
 */																							

@Component("report")
public class ReportGenerator {
	@Scheduled(cron = "")
	public void generateSalesReport() {
		System.out.println("Generate sales report at: "+new Date());
	}
}
