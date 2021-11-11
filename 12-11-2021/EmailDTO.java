package com.xworkz.email.dto;

public class EmailDTO {
	private double storageSize;
	private boolean free;
	private int noOfEmail;
	private String emailId;

	public EmailDTO(double storageSize, boolean free, int noOfEmail, String emailId) {
		
		this.storageSize = storageSize;
		this.free = free;
		this.noOfEmail = noOfEmail;
		this.emailId = emailId;
	}

	public EmailDTO(){
		System.out.println(" EmailDTO no -arg contr invoked ");
		
	}

	public double getStorageSize() {
		return storageSize;
	}

	public void setStorageSize(float storageSize) {
		this.storageSize = storageSize;
	}

	public boolean isFree() {
		return free;
	}

	public void setFree(boolean free) {
		this.free = free;
	}

	public int getNoOfEmail() {
		return noOfEmail;
	}

	public void setNoOfEmail(int noOfEmail) {
		this.noOfEmail = noOfEmail;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	
}
