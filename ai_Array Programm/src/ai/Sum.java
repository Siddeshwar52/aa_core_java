package ai;

public class Sum {
	
	public static void main(String[] args) {
		
		int[] a = { 10, 20, 30};
		
		int sum = 0;
		
		for(int i=0; i<a.length; i++) {
			
			//sum = sum + a[i]; 
			sum += a[i];
		}
		
		System.out.println("The sum of array elements is "+sum);
		
		System.out.println("The average of array elements is "+sum/a.length);
		
	}

}
