package com.xworkz.inheritance.interview;

import com.xworkz.inheritance.ladder.Factory;

public class SugarFactory extends Factory{
	public SugarFactory () {
		System.out.println(" invoking SugarFactory constructor ");
	}
	public void manufacture() {
		 System.out.println(" invoking manufacture from SugarFactory ");
	 }

	 public String toString() {
		 System.out.println("  invoking toString from SugarFactory");
		 return " SugarFactory (CHILD) ";
	 }
	 public int hashCode() {
		 System.out.println("invoking hashCode from SugarFactory ");
		 return 3; 
	 }
}
