package org;

public class Demo {

	public static void main(String[] args) {
		
		System.out.println("Start");
		try {
			System.out.println(10/0);
		}
		catch(Exception e) {
			
			//e.printStackTrace();
			//System.out.println(e.getMessage());
		}
		System.out.println("End");
	}
}
/*
 Exception in thread "main" java.lang.ArithmeticException: / by zero
 at org.Demo.main(Demo.java:7)
 
 Start
java.lang.ArithmeticException: / by zero
	at org.Demo.main(Demo.java:9)
End

Start
/ by zero
End
 */