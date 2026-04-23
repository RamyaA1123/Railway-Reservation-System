package SynchronizedClass;

import ClassesofRailway.Passenger;
import ClassesofRailway.Ticket;
import ClassesofRailway.Train;
import RailwayException.NoSeatAvailableException;

public class ReservationClass {
     static Ticket[] ticketArray=new Ticket[10];
     static int count=0;
     
     public static synchronized void bookTicket(Passenger passenger,Train train)throws Exception {
    	if(train.getAvailableSeat()<=0) {
    		throw new NoSeatAvailableException("There is no seat");
    	}
    	else {
    		Ticket ticket=new Ticket();
        	 ticket.setTicketId(count);
        	 ticket.setPassengerName(passenger.getPassengerName());
        	 ticket.setTrainNo(train.getTrainNo());
        	 ticket.setSeatNumber(train.getTotalSeat()-train.getAvailableSeat());
        	 train.setAvailableSeat(train.getAvailableSeat()-1);
        	 ticketArray[count]=ticket;
        	 System.out.println(ticket);
        	 count++;
        	 
    	}
    	
    	 
     }
     
}
