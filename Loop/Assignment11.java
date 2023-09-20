package Loop;

import java.util.*;
public class Assignment11 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int i,n,fact=1;
		System.out.print("Enert Number:");
		n=sc.nextInt();
		
		System.out.printf("\n%d Factorial= ",n);
		for(i=n;i>=1;i--) {
			fact=fact*i;
		}
		System.out.print(fact);
	}
   
}
