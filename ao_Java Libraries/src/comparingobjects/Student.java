package comparingobjects;

public class Student {

	int age;
	String name;

	Student(int age) {
		this.age = age;
	}

	@Override
	public boolean equals(Object obj) {

		Student s = (Student) obj;
		return this.age == s.age;
	}
	

	public static void main(String[] args) {

		Student s1 = new Student(20);
		Student s2 = new Student(20);
		
//		String s1 = "java";
//		String s2 = "java";

		System.out.println(s1==s2);   // false

		System.out.println(s1.equals(s2));  // false
	}

}
