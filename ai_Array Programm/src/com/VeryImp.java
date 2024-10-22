//Accepting dynamic input with array creation & No of accurances

package com;

import java.util.*;

public class VeryImp {
	
	public static void main(String[] args) {
		System.out.println("Enter No of Elements to be Inserted: ");
		Scanner scan = new Scanner(System.in);
		int size = scan.nextInt();
		int[] a = new int[size];
		
		System.out.println("Enter "+size+" Elemnts: ");
		for(int i=0; i<a.length; i++) {
			a[i] = scan.nextInt();
		}
		
		System.out.println("Array Elements are: ");
		for(int i=0; i<a.length; i++) {
			System.out.println(a[i]);
		}
		System.out.println("Enter the Element to be find the no of Occurances ");
		int element = scan.nextInt();
		scan.close();
		int count = 0;
		for(int i=0; i<a.length; i++) {
			if(element==a[i]) {
				count++;
			}
			
		}
		System.out.println("No of Occurences of "+element+" is "+count);
	}

}
