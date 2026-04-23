package MainClass;

import ClassesofRailway.Passenger;
import ClassesofRailway.Train;
import SynchronizedClass.IRCTCBooking;

public class RailwayBookingMain {
	public static void main(String[] args) {
		Passenger p1=new Passenger("Ramya",21,125);
		Passenger p2=new Passenger("Shruthi",19,450);
		Passenger p3=new Passenger("Tejaswini",22,890);
		
		Train t1=new Train(1120,"Kaveri Express",140,500);
		Train t2=new Train(1235,"Konark Express",70,800);
		
		IRCTCBooking ib =new IRCTCBooking(p1,t1);
		IRCTCBooking ib1 =new IRCTCBooking(p2,t2);
		IRCTCBooking ib2 =new IRCTCBooking(p3,t1);
		
		ib.start();
		ib1.start();
		ib2.start();
		
		
		
	}
}
