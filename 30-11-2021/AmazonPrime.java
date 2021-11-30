package com.xworkz.exception.amazon;

import com.xworkz.exceptions.NotPrimeMemberException;

public class AmazonPrime {
	AmazonPrime (){
		System.out.println("non argument constructor");
	}
	public void  freeDilivery(boolean primeMember,String country) throws NotPrimeMemberException {
		 
		 
		if(primeMember=true && country=="India" ) {
			System.out.println("Eligible for free dilivery");
			
		}
		else {
			System.out.println("member not eligible for free dilivery");
			throw new  NotPrimeMemberException();
		}
	}
	

}

