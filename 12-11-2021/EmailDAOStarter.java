package com.xworkz.email.dao;

import com.xworkz.email.dto.EmailDTO;
import com.xworkz.email.dto.GmailEmailDTO;
import com.xworkz.email.dto.OutLookEmailDTO;

public class EmailDAOStarter {

	public static void main(String[] args) {

		EmailDAO emaildao= new EmailDAO();
		EmailDAO emaildao1= new EmailDAO();
		EmailDAO emaildao2= new EmailDAO();
		
		//EMAILDTO
		EmailDTO emailDTO=new EmailDTO(15.0,true,200,"shashank@gmail.com");
		emaildao.save(emailDTO);
		EmailDTO emailDTO1=new EmailDTO(16.0,true,150,"rao@gmail.com");
		emaildao.save(emailDTO1);
		EmailDTO emailDTO2=new EmailDTO(10.0,false,200,"s@gmail.com");
		emaildao.save(emailDTO2);
		EmailDTO emailDTO3=new EmailDTO(10.0,false,200,"s@gmail.com");
		emaildao.save(emailDTO3);
		
		//OutLookEmailDTO
		OutLookEmailDTO outLookEmailDTO =new OutLookEmailDTO(15.0,true,200,"shashank@gmail.com",1,true);
		emaildao1.save(outLookEmailDTO);
		OutLookEmailDTO outLookEmailDTO1 =new OutLookEmailDTO(16.0,true,150,"rao@gmail.com",2,true);
		emaildao1.save(outLookEmailDTO1);
		OutLookEmailDTO outLookEmailDTO2 =new OutLookEmailDTO(10.0,false,200,"s@gmail.com",1,true);
		emaildao1.save(outLookEmailDTO2);
		
		//GmailEmailDTO
		GmailEmailDTO gmailEmailDTO=new GmailEmailDTO(15.0,true,200,"shashank@gmail.com","white",true);
		emaildao2.save(gmailEmailDTO);
		GmailEmailDTO gmailEmailDTO1=new GmailEmailDTO(55.0,true,20,"@gmail.com","black",false);
		emaildao2.save(gmailEmailDTO1);
		GmailEmailDTO gmailEmailDTO2=new GmailEmailDTO(78.0,false,200,"sri@gmail.com","white",false);
		emaildao2.save(gmailEmailDTO2);
		
		emaildao.displayEmailDeatils();
		emaildao1.displayOutlookEmailDeatils();
		emaildao2.displayGmailEmailDeatils();
		
	}

}
