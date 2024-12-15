package ad;

import java.util.Scanner;

public class Demo {

	void checkEvenOrOdd(int n) {
		if (n%2==0){
			System.out.println(n+" is a Even Number");	
		}else {
			System.out.println(n+" ia a Odd Number");
		}
	}

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		ad.Demo d = new ad.Demo();

		for (int i=1; i<=4; i++) {
			System.out.println("Enter the number");
			int num = scan.nextInt();
			d.checkEvenOrOdd(num);
			System.out.println("--------------");
		}
		scan.close();
	}
}
