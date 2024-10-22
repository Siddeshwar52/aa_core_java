
//Diamond problem in multiple inheritance with default methods

package ad_defaultandstaticmethods;

interface Left{
	default void m1() {
		System.out.println("Left default method");
	}
}

interface Right{
	default void m1() {
		System.out.println("Right default method");
	}
}

public class Test1 implements Left,Right {

	@Override
	public void m1() {
		//Right.super.m1();
		System.out.println("In test class method");
	}

//	@Override
//	public void m1() {
//		Left.super.m1();
//	}
	
	public static void main(String[] args) {
		Test1 t = new Test1();
		t.m1();
	}
}
