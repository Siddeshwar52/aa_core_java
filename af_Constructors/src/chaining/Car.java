package chaining;

public class Car {

	Car(String brand){
		//this(500); // Rercrussive changing
	}

	Car(int cost){
		//this("bmw");
	}
	
	public static void main(String[] args) {
		Car c = new Car("bmw");
	}
}
