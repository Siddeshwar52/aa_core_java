package src;

public class Demo {
	
	static {
		System.out.println("In Static Block-1");
	}
	
	static {
		System.out.println("In Static Block-2");
	}

	public static void main(String[] args) {

		System.out.println("Hello");
	}
	
	static {
		System.out.println("In Static Block-3");
	}

}
