package com.xworkz.inheritance1;

import com.xworkz.inheritance.interview.Carfactory;
import com.xworkz.inheritance.interview.SugarFactory;
import com.xworkz.inheritance.ladder.Factory;

public class FactoryStarter {

	public static void main(String[] args) {
		System.out.println(" ########----PARENT---########");
		Factory factory = new Factory();
		factory.manufacture();
		factory.open();
		factory.shutdown();
		System.out.println(factory.toString());
		System.out.println(factory.hashCode());
		System.out.println(" ########----PARENT---########");
		
		System.out.println(" ");


		System.out.println(" $$$$$$$$----1--PARENT && CHILD---1 ---$$$$$$$$");
		Factory carFactory= new Carfactory();
		carFactory.manufacture();
		carFactory.shutdown();
		System.out.println(carFactory.toString());
		System.out.println(carFactory.hashCode());
		System.out.println(" $$$$$$$$--1--PARENT && CHILD ---1---$$$$$$$$");
		
		System.out.println(" ");

		
		System.out.println(" $$$$$$$$----2--PARENT && CHILD--2 ---$$$$$$$$");
		Factory suagrFactory=new SugarFactory();
		suagrFactory.manufacture();
		System.out.println(suagrFactory.toString());
		System.out.println(suagrFactory.hashCode());
		System.out.println(" $$$$$$$$----2--PARENT && CHILD--2 ---$$$$$$$$");
		
		System.out.println(" ");


		System.out.println("  %%%%%%%----1---CHILD --%%%%%%% ");
		Carfactory carFactory1=new Carfactory();
		carFactory1.manufacture();
		carFactory1.shutdown();
		System.out.println(carFactory1.toString());
		System.out.println(carFactory1.hashCode());
		System.out.println(" %%%%%%%----1---CHILD --%%%%%%% ");
		
		
		System.out.println(" ");
		
		
		System.out.println(" %%%%%%%----2---CHILD --%%%%%%%");
		SugarFactory suagrFactory1= new SugarFactory();
		suagrFactory1.manufacture();
		System.out.println(suagrFactory1.toString());
		System.out.println(suagrFactory1.hashCode());
		System.out.println(" %%%%%%%----2---CHILD --%%%%%%%");

	}

}
