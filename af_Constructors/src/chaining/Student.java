package chaining;

public class Student {

	Student(int age){
		
		this("Tom");
		System.out.println("Age: "+age);

	}

	Student(double height ){
		
		this(22);
		System.out.println("Height: "+height);
		

	}
	Student(String name ){
		
		System.out.println("Name: "+name);

	}

	public static void main(String[] args) {

		Student s = new Student(5.5);

	}

}
