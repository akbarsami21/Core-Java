package exceptionhandling;

import java.util.Scanner;

public class StringindexoutofBounds {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			System.out.print("Enter Name : ");
			String name = sc.nextLine();
			System.out.println("First Index Value : " + name.charAt(9));
		} catch (StringIndexOutOfBoundsException e) {
			System.out.println("Exception : " + e);
		}
		sc.close();
	}

}
