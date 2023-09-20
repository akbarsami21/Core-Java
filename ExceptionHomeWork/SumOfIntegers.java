package ExceptionHomeWork;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SumOfIntegers {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] arr = new int[5];
		int sum = 0;
		try {
			for (int i = 0; i < 5; i++) {
				arr[i] = sc.nextInt();
				sum += arr[i];
			}
			System.out.println("Sum Of The Integers : " + sum);
		} catch (InputMismatchException e1) {
			System.out.println("Invalid input. Please Enter A List Of Integers.");
		}
	}

}
