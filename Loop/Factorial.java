package Loop;

import java.util.*;

public class Factorial {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter Number:");
		int num,i,mul=1;
		num=sc.nextInt();
		for(i=num;i>=1;i--) {
			
			mul=mul*i;
			sc.close();
		}
		System.out.println("Factorial of "+num  +" is="+mul);
		
		
	}

}
