package src;

public class Student {
	
	static int age;
	
	static{
		
		age = 10;
	}
	
	public static void main(String[] args) {
		
		System.out.println(age);
		
	}
	
	static{
		
		age = 20;
	}
	

}
