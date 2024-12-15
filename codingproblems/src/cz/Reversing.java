package cz;

public class Reversing {
	
	public static void main(String[] args) {
		
		String str = "1234";
		
		char[] chr = str.toCharArray();
		
		for(int i=chr.length-1; i>=0; i--){
			System.out.print(chr[i]);
		}
		System.out.println("\n----------------");
		
		StringBuilder sbr = new StringBuilder(str);
		System.out.println("The reversed String is: "+sbr.reverse().toString());
		
		System.out.println(str.replaceAll(" ", ""));
		System.out.println(str.trim());
		
		int number=1234, reverse=0, remainder=0;
		
		while(number != 0){
			
	    remainder = number % 10;  
		reverse = reverse * 10 + remainder;  
		number = number/10;  
		}  
		System.out.println("The reverse of the given number is: " + reverse);  
	}
}
