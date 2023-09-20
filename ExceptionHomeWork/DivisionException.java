package ExceptionHomeWork;

import java.util.Scanner;

public class DivisionException {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter First Number : ");
		int num1=sc.nextInt();
		System.out.print("Enter Second Number: ");
		int num2=sc.nextInt();
		try {
			int value=num1/num2;
			System.out.println(value);
		}catch(ArithmeticException e1) {
			System.out.println("Divided By Zero");
		}
	}

}
