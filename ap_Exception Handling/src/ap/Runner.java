package ap;

public class Runner {

	public static void main(String[] args) {
		try {
			System.out.println(10/0); // Object of ArithmeticException is thrown
		}
		catch(ArithmeticException e) {
			System.out.println("Invalid demoniator");
		}
	}
}
