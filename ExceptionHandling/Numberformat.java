package exceptionhandling;

import java.util.Scanner;

public class Numberformat {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			System.out.print("Enter A String : ");
			String name = sc.nextLine();

			int convert = Integer.parseInt(name);
			System.out.println("Integer Convert : " + convert);

		} catch (NumberFormatException e) {
			System.out.println("Exception : " + e);
		}
		sc.close();
	}
}
