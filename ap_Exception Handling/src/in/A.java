package in;


public class A {
	
	static int age = 100;
	static String name = "Siddeshwar";
	
	public static void getName() {

		System.out.println("The name is "+name);
	}
	
	public static void main(String[] args) {
		//A b = new A();
		System.out.println(age);
		getName();
		
//		try {
//			PrintWriter pw = new PrintWriter("abc.txt");
//			pw.println("Hello");
//		} catch (FileNotFoundException e) {
//			e.printStackTrace();
//		}
		
	}

}
