package comparingobjects;

public class Employee {
	
	int id;
	double height;
	
	Employee(int id, double height) {
		this.id = id;
		this.height = height;
	}
	@Override
	public boolean equals(Object o) {
		
		Employee e  = (Employee) o;
		return this.id == e.id && this.height == e.height;
	}
	
	public static void main(String[] args) {
		
		Employee e1 = new Employee(101, 5.8);
		Employee e2 = new Employee(101, 5.8);
		
		System.out.println(e1.equals(e2));
		
		System.out.println("----------------");
		
		System.out.println(new Employee(1, 5.4).equals(new Employee(1, 5.4)));
		
		System.out.println("----------------");
		
		if(e1.equals(e2)) {
			System.out.println("Contents are same");
		}
		else{
			System.out.println("Contenrs are different");
		}
	}

}
