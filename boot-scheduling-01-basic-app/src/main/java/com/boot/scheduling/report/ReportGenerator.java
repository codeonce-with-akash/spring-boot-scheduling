package com.boot.scheduling.report;

import java.util.Date;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class ReportGenerator {
	
	/*
	 * 1. PERIOD OF TIME: The task/job executes in a loop having certain time gap between successive executions.
	 * 2. POINT OF TIME	: Executing the task at certain date, time and date and time.
	 * 3. initialDelay	: Specifies after starting the app how much delay should be there to execute the scheduled job/task for first time.
	 * 4. fixedDelay	: Executes the task/job back to back having given time gap irrespective whether task/job is completed fastly or slowly.
	 * 5. fixedRate		: Specifies the max time that the task/job should take to complete the execution.
	 * 6. 1000ms 		: 1sec
	 */
	
	//@Scheduled(initialDelay = 5000, fixedDelay = 10000)			
	//@Scheduled(initialDelay = 5000, fixedRate = 10000)
	//@Scheduled - throw (java.lang.IllegalStateException): One-time task only supported with specified initial delay.
	//@Scheduled(initialDelayString = "5000", fixedDelayString = "3000")
	//@Scheduled(initialDelayString = "3000", fixedRateString = "6000")
	//@Scheduled(fixedDelay = 5000) : if initialDelay is not specify then the scheduled method trigger for execution along with app startup.
	@Scheduled(initialDelay = 5000, fixedDelay = 3000)
	public void generateSalesReport() {
		/*
		try {
			Thread.sleep(7000);									
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		*/
		System.out.println("Sales Report Generated On : " + new Date());
		System.out.println("Task-1 Thread Hashcode : " + Thread.currentThread().hashCode());
	}
	
	@Scheduled(initialDelay = 5000, fixedDelay = 4500)
	public void generateEmployeeReport() {
		System.out.println("Employee Report Generated On : "+new Date());
		System.out.println("Task-2 Thread Hashcode : " + Thread.currentThread().hashCode());
	}
}
