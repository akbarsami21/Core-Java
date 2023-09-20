package Conditional;

import java.util.*;

public class Assignment9 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num;
		System.out.print("Enter Number:");
		num=sc.nextInt();
		switch(num) {
		case 1: System.out.println("Selected Language Is Bengali.");
		        break;
		case 2: System.out.println("Selected Language Is Hindi.");
                break;
		case 3: System.out.println("Selected Language Is Urdu.");
                break;
		default:
			    System.out.println("Selected Language is English.");
		        }
		sc.close();
	}

}
