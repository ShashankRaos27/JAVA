package com.xworkz.inheritance.objectmethods;

public class Food {

	private String name;
	private float price;
	private int quantity;
	private String quality;

	public Food() {
		System.out.println("invoked no args const in Food");
	}


	@Override
	public boolean equals(Object obj) {
		System.out.println("invoked equals from Food");
		if (obj != null) {
			System.out.println("ref is not null");
			if (obj instanceof Food)

			{
				System.out.println("ref is food");
				Food casted = (Food) obj;
				String castedFoodName = casted.getName();
				float castedFoodPrice = casted.getPrice();

				if (this.name.equals(castedFoodName) && this.price == castedFoodPrice) {
					System.out.println("Name and price is matching");
					return true;
				} else {
					System.err.println("Name or price is not matching");
				}

			} else {
				System.err.println("i cannot compare, ref is not a FOOD");
			}
		} else {
			System.err.println("ref is null pass proper ref");
		}
		return false;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public String getQuality() {
		return quality;
	}

	public void setQuality(String quality) {
		this.quality = quality;
	}
}