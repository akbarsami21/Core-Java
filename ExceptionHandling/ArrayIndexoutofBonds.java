package exceptionhandling;

import java.util.Scanner;

public class ArrayIndexoutofBonds {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {

			int[] arr = new int[5];
			arr[4] = 23;
			arr[5] = 10;
			System.out.println("Value = " + arr[5]);

		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Exception : " + e);
		} finally {
			System.out.print("Enter FirstNumber :");
			int num1 = sc.nextInt();

			System.out.print("Enter SecondNumber:");
			int num2 = sc.nextInt();

			System.out.print("Sum               : " + (num1 + num2));

		}
		sc.close();
	}

}
