package in;

import java.util.Scanner;

public class Atm {
	
	public static void main(String[] args) {
		
		int amount = 10000;
		System.out.println("Enter the amount to be withdraw");
		Scanner scanner = new Scanner(System.in);
		int withdrawamount = scanner.nextInt();
		try {
			if(withdrawamount<=amount){
				System.out.println("Amount Withdrawn Successfully");
			}
			else {
				System.out.println("Insufficient Amount");
			}
			InsufficientBalanceException insb = new InsufficientBalanceException();
			throw insb;
		}catch(InsufficientBalanceException e){
			
		}
	}

}
