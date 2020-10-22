public class Convertible extends Car {
	boolean isHoodOpen;
	public Convertible() {
		}
	public Convertible(int model, String make, int numOfDoors, boolean isHoodOpen) {
		super(model, make, numOfDoors);
		setModel(model);
		setMake(make);
		setNumOfDoors(numOfDoors);
		setNoOfWheels(4);
		this.isHoodOpen = isHoodOpen;
	}
	public void display() {
		System.out.println("Make: " + getMake() + " Model: " + getModel() + " Number of doors: " + getNumOfDoors() + " isHoodOpen: " + isHoodOpen);
	}
}