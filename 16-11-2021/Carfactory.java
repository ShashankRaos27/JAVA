package com.xworkz.inheritance.interview;

import com.xworkz.inheritance.ladder.Factory;

public class Carfactory extends Factory {
	public Carfactory()
	{
		System.out.println(" invoking Carfactory constr");
	}
	public void manufacture() {
		 System.out.println(" invoking manufacture from Carfactory ");
	 }
	 public String toString() {
		 System.out.println("  invoking toString from Carfactory");
		 return " Carfactory (CHILD) ";
	 }
	 public int hashCode() {
		 System.out.println("invoking hashCode from Carfactory ");
		 return 2; 
	 }

}
