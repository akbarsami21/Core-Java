package Method;

import java.util.*;
   public class Factorial {
	static int factoral(int a) {
		
		
		int fact=1;
	   for(int i=a;i>=1;i--) {
		fact=fact*i;
		
		}
		
		return fact;
		
	}
	   public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Num:");
		int n=sc.nextInt();
		
		System.out.printf("\n %d!=",n);
		int fact=factoral(n);
		System.out.print(fact);
	}

}
