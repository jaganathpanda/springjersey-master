package com.ddlab.rnd.boot;

import org.springframework.stereotype.Component;

@Component("retail")
public class RetailCustomer implements ICustomer {

	public String getType() {
		return "Retail";
	}

}
