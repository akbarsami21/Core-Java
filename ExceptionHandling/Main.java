package exceptionhandling;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter First Num : ");
		int a=sc.nextInt();
		System.out.print("Enter Second Num: ");
		int b=sc.nextInt();
		try {
			int c=a/b;
			System.out.println("\nAnswer : "+c);
		}catch(ArithmeticException e1) {
			System.out.println("Devided By Zero "+e1);
			
		}
		finally {
			
			for(int i=5;i>=b;i--) {
				System.out.println(i+" ");
			}
			System.out.println("After Finally Block");
		}
	}

}
