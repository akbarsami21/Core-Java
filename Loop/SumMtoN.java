package Loop;

import java.util.*;

public class SumMtoN {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int m,n,i,sum=0;
		System.out.print("Enter First Num:");
		m=sc.nextInt();
		System.out.print("Enter Second Num:");
		n=sc.nextInt();
		for(i=m;i<=n;i++) {
			
			sum+=i;
			
			if(i%2==0)
				System.out.println("Even:"+i);
			else 
				System.out.println("Odd:"+i);
		sc.close();
		}
		System.out.print("Sum:"+sum);
	}

}
