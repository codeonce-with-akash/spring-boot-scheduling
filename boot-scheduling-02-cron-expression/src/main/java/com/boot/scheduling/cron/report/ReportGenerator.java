package com.boot.scheduling.cron.report;

import java.util.Date;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/*
 * CRON expression is 6* expression
 * 
 * 		*		*		*		*		*		*
 * 												|----
 * 										|----
 * 								|----
 * 						|----
 * 				|----
 * 		|----
 */

@Component("report")
public class ReportGenerator {
	@Scheduled(cron = "")
	public void generateSalesReport() {
		System.out.println("Generate sales report at: "+new Date());
	}
}
