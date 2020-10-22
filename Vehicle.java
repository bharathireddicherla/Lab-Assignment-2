public class Vehicle {
	
	private int noOfWheels;
	private int noOfPassengers;
	private int model;
	private String make;
	
	public Vehicle() {
		setNoOfWheels(4);
		setNoOfPassengers(0);
	}

	public Vehicle(int noOfWheels, int noOfPassengers, int model, String make) {
		this.noOfWheels = noOfWheels;
		this.noOfPassengers = noOfPassengers;
		this.model = model;
		this.make = make;
	}
	
	public Vehicle(int model, String make) {
		this.model = model;
		this.make = make;
	}
	public int getModel() {
		return model;
	}

	public void setModel(int model) {
		this.model = model;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}
	
	public int getNoOfWheels() {
		return noOfWheels;
	}
public void setNoOfWheels(int noOfWheels) {
		this.noOfWheels = noOfWheels;
	}

	public int getNoOfPassengers() {
		return noOfPassengers;
	}

	public void setNoOfPassengers(int noOfPassengers) {
		this.noOfPassengers = noOfPassengers;
	}

	public void display() {
		System.out.println("Make: " + make + " Model: " + model + " Number of wheels: " + noOfWheels + " Number of passengers: " + noOfPassengers);
	}
}