package ab_gettingandsettingofname;

public class Test {
	
	public static void main(String[] args) {
		
		System.out.println(Thread.currentThread().getName());  //main
		
		Thread.currentThread().setName("custom-main-method");
		
		System.out.println(Thread.currentThread()); //Thread[custom-main-method,5,main]
		
		//System.out.println(10/0); //Exception in thread "custom-main-method"
		
	}

}
