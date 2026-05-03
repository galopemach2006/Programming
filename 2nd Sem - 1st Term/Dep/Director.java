package Dep;

public class Director extends Manager {
	double carAllowance;

	public Director(String name, double salary, String department, double carAllowance) {
		super(name, salary, department);
		this.carAllowance = carAllowance;
	}

	public double increaseAllowance() {
		return carAllowance += 5000;
	}

	public String getDetails(){ 
		return super.getDetails() + "\nCar Allowance: " + carAllowance;
	}
}