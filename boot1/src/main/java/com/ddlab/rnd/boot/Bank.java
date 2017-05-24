package com.ddlab.rnd.boot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Bank {
	
	@Autowired @Qualifier("corporate")
	private ICustomer customer;
	
	public String getCustomerDetails() {
		
		return customer.getType();
	}

}
