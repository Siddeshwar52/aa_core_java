package defaultsorting;

 class Car implements Comparable<Car>{
	
	int cost;

	Car(int cost) {
		this.cost = cost;
	}
	
	@Override
	public String toString() {
		return "cost: "+cost;
	}
	
	@Override
	public int compareTo(Car c) {
		return this.cost-c.cost;
		
	}
	
	

}

//public static void main(String[] args) {
//	
//	Car c = new Car(100);
//	System.out.println(c);
//	
//	String s = new String("Java");
//	System.out.println(s);
//	
//	Integer z = new Integer(10);
//	System.out.println(z);
