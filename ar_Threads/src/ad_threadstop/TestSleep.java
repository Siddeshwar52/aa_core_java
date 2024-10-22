package ad_threadstop;

public class TestSleep {
	
	public static void main(String[] args) throws InterruptedException{
		
		for(int i=1; i<11; i++) {
			System.out.println("Slide - "+i);
			Thread.sleep(1000);
		}
	}

}
