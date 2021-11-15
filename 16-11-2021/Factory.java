package com.xworkz.inheritance.ladder;

public class Factory {
	public Factory() {
		System.out.println("  invoking factory cons  ");
	}
	 public void manufacture() {
		 System.out.println(" invoking manufacture from Factory ");
	 }
	 public void open() {
		 System.out.println(" invoking open from Factory ");
		 
	 }
	 public void shutdown() {
		 System.out.println(" invoking shutdown from factory ");
	 }
	 public String toString() {
		 System.out.println("  invoking toString from factory");
		 return " factory (parent) ";
	 }
	 public int hashCode() {
		 System.out.println("invoking hashCode from Factory ");
		 return 1; 
	 }
}
