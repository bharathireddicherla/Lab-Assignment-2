public class SportCar extends Car {
	
	public SportCar() {
		
	}
	
	public SportCar(int model, String make) {
		
		super(model, make);
		setNumOfDoors(2);	
	}
	
	public void display() {
		System.out.println("Make: " + getMake() + " Model: " + getModel() + " Number of doors: " + getNumOfDoors() );
	}
}