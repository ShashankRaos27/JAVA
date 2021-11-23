package com.xworkz.ElectionComission;

import com.xworkz.ElectionRules.ElectionRules;

public class ElectionComissionComission implements ElectionRules{

	@Override
	public int vaildAge() {
		System.out.println("invoked VaildAge");
		return 18;
	}

	@Override
	public int wardNo() {
		System.out.println("invoked WardNo");
		return 100;
	}

	@Override
	public String address() {
		System.out.println("invoked Adress");
		return "gopala Shimoga";
	}

}