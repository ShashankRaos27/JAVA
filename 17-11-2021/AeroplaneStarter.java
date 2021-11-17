package com.xworkz.inheritance2;

import com.xworkz.inheritance1.Aeroplane;

public class AeroplaneStarter {

	public static void main(String[] args) {
		Aeroplane aeroplane = new Aeroplane();
		aeroplane.setNumber(261);
		aeroplane.setCompany("IndiGO");
		aeroplane.setGovernment("India");

		Aeroplane aeroplane1 = new Aeroplane();
		aeroplane1.setNumber(260);
		aeroplane1.setCompany("IndiGO");
		aeroplane1.setGovernment("India");

		if (aeroplane == aeroplane1) {
			System.out.println("both pointing to same memory");
		}

		boolean same = aeroplane.equals(aeroplane1);
		{
			System.out.println(same);
		}
	}

}
