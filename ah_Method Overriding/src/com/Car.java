package com;

public class Car extends Vehicles {
	
	@Override	   // Optional Annotation 
	void start() {
		System.out.println("Car Started");
		super.start();
	}
	
	void shiftGears() {
		System.out.println("Gears Shifted");
	}

}
