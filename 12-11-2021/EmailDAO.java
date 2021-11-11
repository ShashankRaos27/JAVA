package com.xworkz.email.dao;

import com.xworkz.email.dto.EmailDTO;
import com.xworkz.email.dto.GmailEmailDTO;
import com.xworkz.email.dto.OutLookEmailDTO;

public class EmailDAO {
	EmailDTO[] emails= new EmailDTO[3];
	OutLookEmailDTO [] emails1= new OutLookEmailDTO[3];
	GmailEmailDTO [] emails2= new GmailEmailDTO[3];
	private int count=0;
	
	public void save(EmailDTO emailDTO)
	{
		if(emailDTO!=null && this.count<this.emails.length) {
			this.emails[count]=emailDTO;
			System.out.println(" emailDTO values are add to emails container".concat("   ").concat(String.valueOf(this.count)).concat("   ")
					.concat(emailDTO.getEmailId()));
			this.count++;
		}
		else {
			System.err.println(" emailDTO is having null values or container is full");
		}
	}

	public void save(OutLookEmailDTO outLookEmail)
	{
		if(outLookEmail!=null && this.count<this.emails1.length) {
			this.emails1[count]=outLookEmail;
			System.out.println(" OutLookEmailDTO values are add to emails container".concat("   ").concat(String.valueOf(this.count)).concat("   ")
					.concat(String.valueOf(outLookEmail.isBackup())));
			this.count++;
		}
		else {
			System.out.println(" OutLookEmailDTO is having null values");
		}
	}
	public void save(GmailEmailDTO gmailEmailDTO)
	{
		if(gmailEmailDTO!=null && this.count<this.emails2.length) {
			this.emails2[count]=gmailEmailDTO;
			System.out.println(" gmailEmailDTO values are add to emails container".concat("   ")
					.concat(String.valueOf(this.count)).concat("   ").concat(String.valueOf(gmailEmailDTO.isSubscribed())));
			this.count++;
		}
		else {
			System.out.println(" gmailEmailDTO is having null values");
		}
	}
	public void displayEmailDeatils() {
		for(int i=0;i<this.emails.length;i++) {
			EmailDTO s=	this.emails[i];
			if(s!=null)
			{
			System.out.println(" NoOfEmail ---->".concat(String.valueOf(s.getNoOfEmail())));
			}
			else
				System.err.println("nulll exception");
		}
			}
	public void displayOutlookEmailDeatils() {
		for(int i=0;i<this.emails1.length;i++) {
			OutLookEmailDTO s=	this.emails1[i];
			if(s!=null)
			{
			System.out.println(" CloudStorage---->".concat(String.valueOf(s.getCloudStorage())));
			}
			else
			System.err.println("nulll exception");
	}
		}
		public void displayGmailEmailDeatils() {
			for(int i=0;i<this.emails2.length;i++) {
				GmailEmailDTO s=this.emails2[i];
				if(s!=null) {

				System.out.println(" themeColor---->".concat(s.getThemeColor()));}
				else
					System.err.println("nulll exception");
}
}
		
}



