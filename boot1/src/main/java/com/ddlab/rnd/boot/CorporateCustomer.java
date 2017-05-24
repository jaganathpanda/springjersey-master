package com.ddlab.rnd.boot;

import org.springframework.stereotype.Component;

@Component("corporate")
public class CorporateCustomer implements ICustomer {

	public String getType() {
		return "corporate";
	}

}
