package com.xworkz.collection.arrays;

import java.util.*;

public class Array {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		Mobile mobile= new Mobile();
		System.out.println("enter mobile name ");
		String name=scanner.next();
		 mobile.setName(name); 
		System.out.println("enter usb ");
		String usb=scanner.next();
		mobile.setUsb(usb);
		System.out.println("enter ram");
		int ram=scanner.nextInt();
		mobile.setRAM(ram);
		System.out.println("enter price");
		double price=scanner.nextDouble();
		mobile.setPrice(price);
		System.out.println(" enter country made");
		String made=scanner.next();
		mobile.setMade(made);
		
		
		
		
		
		
		Collection collection3= new ArrayList();
		collection3.add(name);
		collection3.add(usb);
		collection3.add(ram);
		collection3.add(price);
		collection3.add(made);
		System.out.println(collection3);
		

		
		
		
		
		
		
		
		
		
		
		Collection collection=new ArrayList();
	
		collection.add("banglore");
		collection.add("shimoga");
		collection.add(false);
		collection.add(10);
		collection.add(1.21);
		collection.add("rao");
		
		int cSize=collection.size();
		System.out.println(cSize);
		System.out.println(collection);
		System.out.println(collection.isEmpty());
		if (collection.contains("banglore")) {
			System.out.println("yes present");
			
		} else {
			System.out.println(" not present");
		}
		collection.remove("shimoga");
		System.out.println(collection);
	

	Collection collection2 =new ArrayList();

	collection2.add("hassan");
	collection2.add("karnataka");
	collection2.add("xworkz");
	System.out.println(collection2);
	
	collection2.addAll(collection);
	System.out.println(collection2);
	
	
	System.out.println(collection.containsAll(collection2));
	System.out.println(collection.retainAll(collection2));
	System.out.println(collection);
	System.out.println(collection2.retainAll(collection));
	System.out.println(collection2);
	//System.out.println(retain);
	collection.clear();
	System.out.println(collection);
	}
}
