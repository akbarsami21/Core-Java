package exceptionhandling;

import java.util.Scanner;

public class ArithmaticException {
	public static void main(String[] args) {
	
	Scanner sc=new Scanner(System.in);
	try {
		System.out.print("Enter First Number  : ");
		int num1=sc.nextInt();
		
		System.out.print("Enter Second Number : ");
		int num2=sc.nextInt();
		
		int result=num1/num2;
		System.out.println("Sum : "+result);
	}catch(ArithmeticException e) {
		System.out.println("Exception : "+e);
	}
	
	System.out.println("Hello World");
	sc.close();
}
}