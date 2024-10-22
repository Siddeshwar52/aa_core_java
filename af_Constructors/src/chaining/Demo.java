package chaining;

public class Demo {

	Demo(int a){

		System.out.println(1);

	}

	Demo(){
		this(10);                  // Constructor Chaining
		System.out.println(2);

	}

	public static void main(String[] args) {
		System.out.println("Start");

		new Demo();

		System.out.println("End");
	}

}
