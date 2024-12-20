package runtime;

class Vehicles {
	 void start() {

		 System.out.println("Vehicle started");
	}
}

class Bike extends Vehicles{
	@Override
	 void start() {

		System.out.println("Bike has started");
	}
}

class Car extends Vehicles {
	@Override
	void start() {

		System.out.println("Car Started");
	}
}

public class Solution {
	public static void main(String[] args) {
		Vehicles v1 = new Car();
		v1.start();
		Vehicles v2 = new Bike();
		v2.start();
		Vehicles v3 = new Vehicles();
		v3.start();
	}
}
