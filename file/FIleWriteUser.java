package file;

import java.util.Formatter;
import java.util.Scanner;

public class FIleWriteUser {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name, id;

		try {
			Formatter formatter = new Formatter(
					"C:/Users/mdsam/OneDrive/Documents/Eclipse_Project/FILE/JavaFile/Third Semester/Digital Electronics.txt");
			System.out.print("How Many Student? = ");
			int num = sc.nextInt();

			for (int i = 1; i <= num; i++) {
				System.out.print("Enter Name : ");
				name = sc.next();

				System.out.print("Enter ID   : ");
				id = sc.next();

				formatter.format("%s, %s\r\n", name, id);
			}
			formatter.close();

		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
