package com.xworkz.email.dto;

public class GmailEmailDTO extends EmailDTO{
	private String themeColor;
	private boolean subscribed;

	public GmailEmailDTO() {
		super();
		System.out.println(" GmailEmailDTO no-arg contructor invoked ");
	
	}

	public GmailEmailDTO(double storageSize, boolean free, int noOfEmail, String emailId, String themeColor,boolean subscribed) {
		
		super(storageSize, free, noOfEmail, emailId);
		this.themeColor = themeColor;
		this.subscribed = subscribed;
	}

	public String getThemeColor() {
		return themeColor;
	}

	public void setThemeColor(String themeColor) {
		this.themeColor = themeColor;
	}

	public boolean isSubscribed() {
		return subscribed;
	}

	public void setSubscribed(boolean subscribed) {
		this.subscribed = subscribed;
	}
}
