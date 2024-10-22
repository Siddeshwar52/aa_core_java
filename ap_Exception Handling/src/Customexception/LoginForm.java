//Custom Exception creation

package Customexception;

import java.util.Scanner;

public class LoginForm {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter userid: ");
		String id = scan.next();

		System.out.println("Enter password: ");
		int password = scan.nextInt();
		
				
		if(id.equals("admin")){
			
			if(password == 123){
				
				System.out.println("Login Exception");
			}
			else{
				try {
				// throw new InvalidPasswordException();
				InvalidPasswordException obj = new InvalidPasswordException();
				throw obj;
				}
				catch(InvalidPasswordException e) {
					System.out.println("Invalid Password Entered!");
				}
			}
		}
		
		scan.close();
		
	}

}
