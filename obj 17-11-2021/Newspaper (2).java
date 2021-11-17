package com.xworkz.inheritance2;

import com.xworkz.inheritance.objectmethods.NewsPaper;

public class Newspaper {

	public static void main(String[] args) {
		NewsPaper newsPaper = new NewsPaper();
		newsPaper.setName("VijayaKarnataka");
		newsPaper.setLanguage("Kannada");
		newsPaper.setSince(1999);

		NewsPaper newsPaper1 = new NewsPaper();
		newsPaper1.setName("Vijayavani");
		newsPaper1.setLanguage("Kannada");
		newsPaper1.setSince(1999);

		if (newsPaper == newsPaper1) {
			System.out.println("both pointing to same memory");
		}

		boolean same = newsPaper.equals(newsPaper1);// TRUE
		{
			System.out.println(same);
		}
	}

}
