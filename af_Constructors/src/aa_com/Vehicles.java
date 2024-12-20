package aa_com;

public class Vehicles {
	
	Vehicles(String brand, int cost){

		System.out.println("Brand: "+brand+" Cost:"+cost);
	}
	
	Vehicles(String brand){

		System.out.println("Brand: "+brand);
	}
	
	Vehicles(String brand, String fuel){

		System.out.println("Brand: "+brand+"Fuel: "+fuel);
	}
	
	Vehicles(int cost, String brand){

		System.out.println("Cost: "+cost+"Brand: "+brand);
	}
	
	public static void main(String[] args) {
		
	
		Vehicles v1 = new Vehicles("BMW");
		Vehicles v2 = new Vehicles("Audi", 50000);
		
		new Vehicles(8999,"Suzuki");              // Without giving address to new object we can create and instatiante object
		new Vehicles("Honda","Petrol");           // Without giving address to new object we can create and instatiante object
	}

}
