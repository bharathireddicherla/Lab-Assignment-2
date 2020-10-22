public class Car extends Vehicle{
	
	private int numOfDoors;
	
	public Car() {
		
	}
	
	public Car(int model, String make, int numOfDoors) {
		super(model, make);
		setMake(make);
		setModel(model);
		setNoOfWheels(4);
		this.numOfDoors = numOfDoors;
	}
	public Car(int model, String make) {
		super(model, make);
		setMake(make);
		setModel(model);
		setNoOfWheels(4);
	}
	
	public int getNumOfDoors() {
		return numOfDoors;
	}
	
	public void setNumOfDoors(int numOfDoors) {
		this.numOfDoors = numOfDoors;
	}
	
	public void display() {
		System.out.println("Make: " + getMake() + " Model: " + getModel() + " Number of doors: " + numOfDoors);
	}
}