package busResv;

public class Bus {
	private int busNo;
	private boolean ac;
	private int capacity;
	Bus(int busNO,boolean ac,int capacity){
		this.busNo=busNO;
		this.ac=ac;
		this.capacity=capacity;
		}
	
	public int getCapacity() {
		return capacity;
	}
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	public int getBusNo() {
		return busNo;
	}
	public boolean getAc() {
		return ac;
	}
	public void setAc(boolean ac) {
		this.ac = ac;
	}
	public void displayBusInfo() {
		System.out.println("Bus NO:"+busNo+"AC"+ac+"Total Capacity:"+capacity);
	}

}
