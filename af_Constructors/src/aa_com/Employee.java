package aa_com;

public class Employee {
	
	int id;
	String name;
	double salary;
	
	Employee(int id1, String name1, double salary1){
		
		this.id = id1;
		this.name = name1;
		this.salary = salary1;
	}
	
	void display() {
		System.out.println("Employee Id: "+this.id);
		System.out.println("Employee Name: "+this.name);
		System.out.println("Employee salary: "+this.salary);
		
	}
	
	public static void main(String[] args) {
		Employee e1 = new Employee(101, "ding1" , 500.88);
		Employee e2 = new Employee(102, "binga" , 600.88);
		
		e1.display();
		System.out.println("-------------------");
		e2.display();
		
	
	}

}
