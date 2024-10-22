package customsorting;

public class Student {
	
	int age;
	String name;
	
	Student(int age, String name) {
		this.age = age;
		this.name = name;
	}
	
	public String toString() {
		return "Student [age="+age+" , name= "+ name + "]";
	}

}
