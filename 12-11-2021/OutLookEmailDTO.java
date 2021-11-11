package com.xworkz.email.dto;

public class OutLookEmailDTO extends EmailDTO {

	private int cloudStorage;
	private boolean backup;
	public OutLookEmailDTO(double storageSize, boolean free, int noOfEmail, String emailId, int cloudStorage,
			boolean backup) {
		
		super(storageSize, free, noOfEmail, emailId);
		this.cloudStorage = cloudStorage;
		this.backup = backup;
	}
	public int getCloudStorage() {
		return cloudStorage;
	}
	public void setCloudStorage(int cloudStorage) {
		this.cloudStorage = cloudStorage;
	}
	public boolean isBackup() {
		return backup;
	}
	public void setBackup(boolean backup) {
		this.backup = backup;
	}
	
	//public OutLookEmailDTO() {
	//	System.out.println("OutLookEmailDTO contructor invoked");
	
	
}
