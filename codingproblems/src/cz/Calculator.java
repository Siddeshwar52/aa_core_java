package cz;

/* Write a program that accepts two numbers and a operator like (+,-,*, /) as command line arguments
and perform the appropriate operation indicated by operator. If the user enters any other character the appropriate message will be displayed. 
The output of the program should be displayed to the user */


public class Calculator
{
   public static void main(String[] args){
       int a = Integer.parseInt(args[0]);
       int b = Integer.parseInt(args[1]);
       int c;
       String s = args[2];
       System.out.println("s="+s);
       
       if (s.equals("+"))
       {
           c=a+b;
           System.out.println("Its Addition & sum of "+a+" & "+b+" is "+c);
       }
       
       else if (s.equals("-"))
       {
           c=a-b;
           System.out.println("Its Subtraction & difference between "+a+" & "+b+" is "+c);
       }
       
       else if (s.equals("x"))
       {
           c=a*b;
           System.out.println("Its Multiplication & product of "+a+" & "+b+" is "+c);
       }  
       
       else if (s.equals("/"))
       {
           c=a/b;
           System.out.println("Its Division & result of "+a+" & "+b+" is "+c);
       }
       
       else
       {
           System.out.println("Invalid Choice");
       }
   }
}
