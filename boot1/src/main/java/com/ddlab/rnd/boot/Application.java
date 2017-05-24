package com.ddlab.rnd.boot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

/** @SpringBootApplication annotation is required to run the boot application
 * as thick client application using the command java -jar <jarFileName>.jar
 * 
 * @author Debadatta Mishra
 *
 */
@SpringBootApplication 
public class Application {

	@Component
	private static class Runner implements CommandLineRunner {

		@Autowired
		private Bank bank;

		public void run(String... arg0) throws Exception {

			String bankCustomerDetails = bank.getCustomerDetails();
			System.out.println("**************************************");
			System.out.println("**************************************");
			System.out.println("Cusomer Details :::" + bankCustomerDetails);
			System.out.println("**************************************");
			System.out.println("**************************************");
			
		}
	}

	public static void main(String[] args) {
		
		SpringApplication.run(Application.class, args);
	}
}
