package ClassesofRailway;

public class Train {
        private int trainNo;
        private String trainName;
        private int availableSeat;
        private int totalSeat;
        
        
        
        public Train(int trainNo, String trainName, int availableSeat, int totalSeat) {
			super();
			this.trainNo = trainNo;
			this.trainName = trainName;
			this.availableSeat = availableSeat;
			this.totalSeat = totalSeat;
		}
		public int getTrainNo() {
			return trainNo;
		}
		public void setTrainNo(int trainNo) {
			this.trainNo = trainNo;
		}
		public String getTrainName() {
			return trainName;
		}
		public void setTrainName(String trainName) {
			this.trainName = trainName;
		}
		public int getAvailableSeat() {
			return availableSeat;
		}
		public void setAvailableSeat(int availableSeat) {
			this.availableSeat = availableSeat;
		}
		public int getTotalSeat() {
			return totalSeat;
		}
		public void setTotalSeat(int totalSeat) {
			this.totalSeat = totalSeat;
		}
        
        
        
}
