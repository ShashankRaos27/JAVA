package com.xworkz.interfaces.runner;
import com.xworkz.interfacesabstract;
import com.xworkz.interfaces.rules.HostelRules;

public class HostelRunner {

	public static void main(String[] args) {

		Hostel hostel = new HostelRules();

		System.out.println(hostel.admission());
		System.out.println(hostel.closeTime());
		System.out.println(hostel.gender());

	}

}