package am;

import am.Car;

public class User extends Car {
	@Override
	void stop() {
		System.out.println("Car Stoped");
	}
	
	@Override
	void start() {
		System.out.println("Car Started");
	}
	
	//optionally override shiftGears() as well

	public static void main(String[] args) {
		
		User u = new User();
		
		u.start();
		u.shiftGears();
		u.stop();
	}
}
