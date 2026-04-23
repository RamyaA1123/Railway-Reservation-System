package SynchronizedClass;

import ClassesofRailway.Passenger;
import ClassesofRailway.Train;

public class IRCTCBooking extends Thread{
	Passenger passenger;
	Train train;
	
	public IRCTCBooking(Passenger passenger,Train train){
		this.passenger=passenger;
		this.train=train;
		
	}
	@Override
	public void run() {
		try {
			ReservationClass.bookTicket(passenger,train);
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}

}
