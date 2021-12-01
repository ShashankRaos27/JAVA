package com.xworkz.exception.event;

import com.xworkz.constant.TicketType;

public class Theater {

	private final int gandhiClassTicket=5;
	private final int middleClassTicket=5;
	private final int balconyTicket=2;
	private String movieName;
	
	public Theater(String movieName) {
		this.movieName=movieName;
	}
	
	public boolean bookTickets(String movieName,TicketType ticketType, int totalTickets)
	{
		System.out.println("invoked  booktickets");
		if(movieName.equals(movieName))
		{
			if(TicketType.GANDHI_CLASS.equals(ticketType) && totalTickets<=this.gandhiClassTicket) {
				System.out.println(this.movieName.concat(" is booked with ").concat(ticketType.toString()));
			}
			else if(TicketType.MIDDLE_CLASS.equals(ticketType) && totalTickets<=this.middleClassTicket){
				System.out.println(this.movieName.concat(" is booked with ").concat(ticketType.toString()));

			}
			else if(TicketType.BALCONY.equals(ticketType) && totalTickets<=this.balconyTicket) {
				System.out.println(this.movieName.concat(" is booked with ").concat(ticketType.toString()));

			}
			else {
				System.err.println(" not booked".concat(movieName));
				
				if(TicketType.GANDHI_CLASS.equals(ticketType) || TicketType.MIDDLE_CLASS.equals(ticketType) || TicketType.BALCONY.equals(ticketType) )
				throw new HouseFullRunTimeException(" max 5 tickets only for this class " .concat(ticketType.toString()));
			}
		}
		return true;
	}
	
}
