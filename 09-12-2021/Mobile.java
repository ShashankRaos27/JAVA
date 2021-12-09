package com.xworkz.collection.arrays;

public class Mobile  {

	private String name;
	private String usb; 
	private int RAM;
	private double price;
	private String made;
	
	public Mobile() {
		System.out.println("invoking mobile con");
}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUsb() {
		return usb;
	}
	public void setUsb(String usb) {
		this.usb = usb;
	}
	public int getRAM() {
		return RAM;
	}
	public void setRAM(int rAM) {
		RAM = rAM;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getMade() {
		return made;
	}
	public void setMade(String made) {
		this.made = made;
	}
	
	

}
