package com.xworkz.interfaces.rules;

import com.xworkz.interfaces.abstract;

public class HospitalRules implements Hospital {

	public String register() {

		System.out.println("INVOKED REGISTER");
		return "Registered ";
	}

	public double payAdvance() {

		System.out.println("INVOKED PAYADVANCE");
		return 10000;
	}

	public boolean validInsurance() {
		System.out.println("INVOKED VALIDINSURANCE");
		return true;
	}
}