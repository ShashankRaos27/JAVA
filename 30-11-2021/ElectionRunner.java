package com.xworkz.exception;

import com.xworkz.exceptions.NotEligibleForVote;

public class ElectionRunner {
	public static void main(String[] args)  throws NotEligibleForVote {
		ElectionComission ref=new ElectionComission();
		ref.canVote(null, 0);
		System.out.println("all basic requirements are full filled");
	}

}