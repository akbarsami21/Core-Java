
package Pattern;

import java.util.*;

public class ButterFly {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n, i, j;
		System.out.print("Enter Num:");
		n = sc.nextInt();
		for (i = 1; i <= n; i++) {
			for (j = 1; j <= i; j++) {
				System.out.print("*");
			}
			int space = 2 * (n - i);
			for (j = 1; j <= space; j++) {
				System.out.print(" ");
			}
			for (j = 1; j <= i; j++) {
				System.out.print("*");
				sc.close();
			}

			System.out.println();
		}
		for (i = n; i >= 1; i--) {
			for (j = 1; j <= i; j++) {
				System.out.print("*");
			}
			int space = 2 * (n - i);
			for (j = 1; j <= space; j++) {
				System.out.print(" ");
			}
			for (j = 1; j <= i; j++) {
				System.out.print("*");
			}

			System.out.println();

		}

	}

}
