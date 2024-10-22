package comStoringobjects;

public class Person {
	
	int age;
	String name;
	
	public Person(int age, String name) {
		
		this.age = age;
		this.name = name;
	}
	
	@Override
	public String toString() {
		
		return "Age: "+age+"Name "+name ;
		
	}
	
	public static void main(String[] args) {
		
		Person p1 = new Person(21, "Dinga");
		Person p2 = new Person(22, "Guldu");
		Person p3 = new Person(23, "Dingi");
		
		Person[] p = new Person[3];
		
		p[0] = p1;
		p[1] = p2;
		p[2] = p3;
		
		for(int i=0; i<p.length; i++) {
			
			System.out.println(p[i]);
		}
		
	}

}
