package ad;

public class Car {
	
	static int cost = 10;
	 
	public static void main(String[] args) {
		
		System.out.println(cost); // Car.cost
		Car.cost = 20;
		System.out.println(Car.cost); // Car.cost
		System.out.println("---------------");
		Car c1 = new Car();
		System.out.println(c1.cost); // Accessing a static variable through non static way is not a good practice
	}
}
