package com.xworkz.inheritance1;

import com.xworkz.inheritance.objectmethods.Shoe;

public class shoeStarter {
	public static void main(String[] args)
	{
		Shoe shoe = new Shoe();
		shoe.setBrand("Puma");
		shoe.setSize(8);
		shoe.setColor("White");
		shoe.setGender("Female");

		Shoe shoe1 = new Shoe();
		shoe1.setBrand("Puma");
		shoe1.setSize(7);
		shoe1.setColor("Black");
		shoe1.setGender("Female");

		if(shoe==shoe1) 
		{
			System.out.println("both pointing to same memory");
		}
		boolean same = shoe.equals(shoe1);// TRUE
		{
			System.out.println(same);
		}

	}

}
