package src;

public class Runner {
	
	static void m1()
	{
		System.out.println("Hai");
		int result = m2();
		System.out.println("Bye "+result);
	}
	
	static int m2() {
		return 20;
	}
	
	public static void main(String[] args) {
		System.out.println("Start");
		m1();
		System.out.println("End");
	}

}
