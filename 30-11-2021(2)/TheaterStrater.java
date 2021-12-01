package com.xworkz.exception.event;

import com.xworkz.constant.TicketType;

public class TheaterStrater {
	
	public static void main(String[] args) {

		Theater theater=new Theater("bhahubali");
		theater.bookTickets("bahubali",TicketType.BALCONY , 6);
	}

}
