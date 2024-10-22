package com;

class Son extends Father {

	@Override
	void bike() {
		System.out.println("New modified son's bike");
	}

	public static void main(String[] args) {

		Son s = new Son();
		s.bike();                                      //New modified son's bike
		
		Father f = new Father();
		f.bike();                                     //Old Fashioned Father's Bike!
		
		Father fs = new Son();
		fs.bike();                                    //New modified son's bike
	}
}