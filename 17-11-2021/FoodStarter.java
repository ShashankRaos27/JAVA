package com.xworkz.inheritance2;

import com.xworkz.inheritance.objectmethods.Food;

public class FoodStarter {
	public static void main(String[] args) {
	Food food = new Food();
	food.setName("Chicken Biriyani");
	food.setPrice(499.1f);
	food.setQuantity(2);
	food.setQuality("Good");

	Food food1 = new Food();
	food1.setName("Chicken Biriyani");
	food1.setPrice(499.1f);
	food1.setQuantity(5);
	food1.setQuality("Nice");

	if (food == food1) {
		System.out.println("both pointing to same memory");
	}
	// NAME--PRICE = equals
	boolean same = food.equals(food1);
	{
		System.out.println(same);
	}
}

}


