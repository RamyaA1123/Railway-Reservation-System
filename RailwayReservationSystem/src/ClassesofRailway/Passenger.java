package ClassesofRailway;

public class Passenger {
	private String passengerName;
	private int passengerAge;
	private int passengerId;
	public Passenger(String passengerName, int passengerAge, int passengerId) {
		super();
		this.passengerName = passengerName;
		this.passengerAge = passengerAge;
		this.passengerId = passengerId;
	}
	public String getPassengerName() {
		return passengerName;
	}
	public void setPassengerName(String passengerName) {
		this.passengerName = passengerName;
	}
	public int getPassengerAge() {
		return passengerAge;
	}
	public void setPassengerAge(int passengerAge) {
		this.passengerAge = passengerAge;
	}
	public int getPassengerId() {
		return passengerId;
	}
	public void setPassengerId(int passengerId) {
		this.passengerId = passengerId;
	}
	
	

}
