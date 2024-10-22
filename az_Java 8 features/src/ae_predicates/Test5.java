
//Program for User Authentication by using Predicate

package ae_predicates;

import java.util.Scanner;
import java.util.function.Predicate;

class User{
	String username;
	String pwd;
	
	User(String username, String pwd) {
		this.username = username;
		this.pwd = pwd;
	}
}

public class Test5 {
	
	public static void main(String[] args) {
		Predicate<User> p = u->u.username.equalsIgnoreCase("Durga") && u.pwd.equals("Java");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter username");
		String us = sc.next();
		System.out.println("Enter passowrd");
		String pd = sc.next();
		sc.close();
		User user = new User(us, pd);
		if(p.test(user)) {
			System.out.println("Valid User");
		}else {
			System.out.println("Invalid username or password");
		}
	}
}
