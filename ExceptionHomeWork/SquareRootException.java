package ExceptionHomeWork;

import java.util.Scanner;

class NegativeInputException extends RuntimeException {
	NegativeInputException(String message) {
		super(message);
	}
}

public class SquareRootException {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number: ");
		int num = sc.nextInt();

		if (num >= 0) {
			double sqrt = Math.sqrt(num);
			System.out.printf("%.2f", sqrt);
		}

		try {
			if (num < 0) {
				throw new NegativeInputException("Input Is Negative");
			}
		} catch (NegativeInputException e1) {
			System.out.println(e1.getMessage());
		}

	}
}
