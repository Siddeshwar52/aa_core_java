package tm;

public class Demp {

	static void div() throws ArithmeticException{

		System.out.println(10/0);
	}

	public static void main(String[] args) {

		System.out.println("Start");
		try {
			div();
		} catch(Exception e) {

		}

		System.out.println("End");

	}

}
