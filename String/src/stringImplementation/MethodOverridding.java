package stringImplementation;

class Vehicle{
	void start() {
		System.out.println("Vehicle Started");
	}
}

class Car extends Vehicle{
	@Override
	void start() {
		System.out.println("Car Started");
	}
}

public class MethodOverridding {
	public static void main(String[] args) {
		Vehicle vehicle = new Vehicle();
		Car car = new Car();
		
		vehicle.start();
		car.start();
	}

}
