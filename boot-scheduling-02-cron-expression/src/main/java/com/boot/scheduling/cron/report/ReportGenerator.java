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

/*
 * Allowed symbols are:
 * 	
 *		* -> any/all/every
 *		/ -> to specify PERIOD OF TIME
 *		, -> to specify the possible list of values
 *		- -> to specify range of values
 *		? -> any (can be used only in date and weekdays)
 */
@Component("report")
public class ReportGenerator {
	/** POINT OF TIME **/
	//@Scheduled(cron = "10 * * * * *")		// task will execute every 10th second of every minute
	//@Scheduled(cron = "1 2 20 * * *")		// task will execute every day at 8pm 2min 1sec
	//@Scheduled(cron = "0 2 8,10 * * *")	// task will execute every day at 8:02am and 10:02am
	//@Scheduled(cron = "10 20 9-13 * * *")	// task will execute every day at 9:20:10am, 10:20:10am, 11:20:10am, 12:20:10pm, 13:20:10pm 
	//@Scheduled(cron = "0 20 22 12 * *")	// task will execute every month 12 date at 10:20:00pm
	//@Scheduled(cron = "0 0 22 * * *")		// task will execute every day at 10pm
	//@Scheduled(cron = "0 25 20 * * WED")	// task will execute every day of every month WED at 8:25:00pm
	//@Scheduled(cron = "0 30 20 * AUG WED")// task will execute every Wednesday of AUG month at 8:30:00pm
	//@Scheduled(cron = "0 0 6 9 5 SUN")	// task will execute every year May 9th at 6:00:00am if the May 9th week day is Sunday.		
	//@Scheduled(cron = "59 59 23 31 DEC *")// task will execute every year on 31st DEC at 11:59:59pm (before 1 second)
	//@Scheduled(cron = "0 0 0 1 JAN *")	// task will execute happy new year wishes on 00:00:00am on 1st JAN
	//@Scheduled(cron="0 0 0 5 9 MON-SAT")	// task will execute every year on Teachers day only if it is not SUN
	//@Scheduled(cron = "0 0 0 1-31 1 *")	// task will execute every day of JAN month at 00:00:00am (every year)
	//@Scheduled(cron = "0 0 0 ? 1 ?")		// task will execute every day of JAN month at 00:00:00am (every year)
	//@Scheduled(cron = "0 58 20 ? 8 WED")	// task will execute every WED day in AUG month at 08:58:00pm
	//@Scheduled(cron = "* * * ? AUG ?")	// task will execute in AUG month every day every hour every minute every second and every weekday
	
	/** PERIOD OF TIME **/
	//@Scheduled(cron = "0/20 * * * * *")	// execute the given task having 20 seconds of gap
	//@Scheduled(cron = "10 0/2 * * * *")	// execute the given task having exact 2mins of gap at 10th seconds after application start
	//@Scheduled(cron = "20 0/2 21 * * *")	// execute the given task every at 09pm 20th seconds having exact 2mins of gap interval
	//@Scheduled(cron = "10 31/1 21 * * *")	// execute the given task at 21:31:10 having 10seconds of gap next execution is at 21:32:10, 21:33:10, 21:34:10
	//@Scheduled(cron = "0/10 0/1 21 * * *")// execute the given task at every 10seconds of gap from 9pm.
	//@Scheduled(cron = "45 0/1 21 * * *")	// execute the task every minute starting from 9pm at 45th second (21:00:45, 21:01:45)
	public void generateSalesReport() {
		System.out.println("Generate sales report at: "+new Date());
	}
}
