package ClassesofRailway;

public class Ticket {
        private int ticketId;
        private int trainNo;
        private int seatNumber;
        private String passengerName;
		public int getTicketId() {
			return ticketId;
		}
		public void setTicketId(int ticketId) {
			this.ticketId = ticketId;
		}
		public int getTrainNo() {
			return trainNo;
		}
		public void setTrainNo(int trainNo) {
			this.trainNo = trainNo;
		}
		public int getSeatNumber() {
			return seatNumber;
		}
		public void setSeatNumber(int seatNumber) {
			this.seatNumber = seatNumber;
		}
		public String getPassengerName() {
			return passengerName;
		}
		public void setPassengerName(String passengerName) {
			this.passengerName = passengerName;
		}
		@Override
		public String toString() {
			return "Ticket [ticketId=" + ticketId + ", trainNo=" + trainNo + ", seatNumber=" + seatNumber
					+ ", passengerName=" + passengerName + "]";
		}
        
        
}
