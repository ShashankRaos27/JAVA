package com.xworkz.interfaces.rules;

import com.xworkz.interfaces.abstract;

public class HostelRules implements Hostel {

	public boolean admission() {

		System.out.println("INVOKED ADMISSION");
		return true;
	}

	public double closeTime() {

		System.out.println("INVOKED CLOSETIME");
		return 10.00;
	}

	public String gender() {

		System.out.println("INVOKED GENDER");
		return "male";
	}

}