package com.xworkz.patient;

import com.xworkz.patient.operator.WarddrobeOperator;

public class WardrobeStarter {
 public static void main(String[] args)
 {
	 WarddrobeOperator operator=new WarddrobeOperator();
	boolean status = operator.add("PANT");
	operator.add("SHIRT");
	operator.add("SAREE");
	operator.add("T-SHIRT");
	operator.add("KURTHA");
	

	
	if(status)
	{
		System.out.println("adding is done");
	}
	else
	{
		System.out.println("adding is not done");
	}
	boolean status1=operator.delete(3);
	if(status1)
	{
		System.out.println("deleting is done");
	}
	else
	{
		System.out.println("deleting is not done");
	}
	boolean status2=operator.update(1,"JEANS");
	if(status2)
	{
		System.out.println("updating is done");
	}
	else 
	{
		System.out.println("updating is not done");

	}
	boolean status3=operator.match("JEANS");
	if(status3)
	{
		System.out.println("matching is done");

	}
	else
		System.out.println("matching is NOT done");
	
	boolean status4=operator.matchFirstChar("P");
	if(status4)
	{
		System.out.println("matchFirstChar is done");

	}
	else
	{
		System.out.println("matchFirstChar is not done");

	}
	boolean status5=operator.matchLastChar("P");
	if(status5)
	{
		System.out.println("matchLastChar is done");

	}
	else
	{
		System.out.println("matchLastChar is not done");

	}

 }
}
