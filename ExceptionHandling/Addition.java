package exceptionhandling;

import java.util.Scanner;

public class Addition {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (true) {
			try {
				System.out.print("\n\nplease enter num1 : ");
				int num1 = sc.nextInt();

				System.out.print("please enter num2 : ");
				int num2 = sc.nextInt();

				System.out.printf("Result : %d/%d = %d\n\n", num1, num2, (num1 / num2));

			} catch (Exception e1) {
				System.out.println("Exception : " + e1);
				System.out.println("You Must Enter Integer.Please Try Again");

			}
		}
	}

}
