package cz;

public class TestDeadlockExample1 {

	public static void main(String[] args) throws InterruptedException {

		//Thread.currentThread().join();
		// Thread.currentThread() -> to get current thread
		// join() indicates to wait until main threads execution completes
		
		final String resource1 = "resource1 resource1";  
	    final String resource2 = "resource2 resource2"; 
	    
	    // t1 tries to lock resource1 then resource2  
	    Thread t1 = new Thread() {  
	      public void run() {  
	          synchronized (resource1) {  
	           System.out.println("Thread 1: locked resource 1");  
	  
	           synchronized (resource2) {  
	            System.out.println("Thread 1: locked resource 2");  
	           }  
	         }  
	      }  
	    };  
	  
	    // t2 tries to lock resource2 then resource1  
	    Thread t2 = new Thread() {  
	      public void run() {  
	        synchronized (resource2) {  
	          System.out.println("Thread 2: locked resource 2");  
	  
	          synchronized (resource1) {  
	            System.out.println("Thread 2: locked resource 1");  
	          }  
	        }  
	      }  
	    };  
	    
	    t1.start();  
	    t2.start();  
	  }    
}       