package aa_com;

public class Student {
	
     int age;
     
     Student(int age){
         this.age = age;
     }
     
     public static void main(String[] args) {
	   
    	 Student s1 = new Student(21);
    	 Student s2 = new Student(22);
    	 
    	 System.out.println("Age: "+s1.age);
    	 System.out.println("Age: "+s2.age);
    	 
	}
}

/*
 * Global Variable : IF we declare a variable within in a class limit than it is called 
 * as global variable (Static and non static variable)
 * 
 * Local variable :  In a specific scope it is called as local variable 
 * 
 */
