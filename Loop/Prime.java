package Loop;

import java.util.Scanner;

class PrimeCheck {
	int isprime(int n) {

		int count = 0;
		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				count++;
				break;
			}
		}

		return count;
	}
}

public class Prime {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number : ");
		int num = sc.nextInt();
		PrimeCheck p = new PrimeCheck();
		
		if (p.isprime(num) == 0) {
			System.out.println("Prime Number");
		} else {
			System.out.println("Not Prime Number");
		}
		sc.close();
	}
}
