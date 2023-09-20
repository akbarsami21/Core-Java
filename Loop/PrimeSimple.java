package Loop;

import java.util.*;

public class PrimeSimple {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int m,n,i,count=0;
		System.out.print("Enter Num:");
		m=sc.nextInt();
	
		for(i=2;i<m;i++) {
			if(m%i==0)
				count++;
			 break;
		}
		if(count==0)
			System.out.print("Prime Number");
		else 
			System.out.print("Not Prime");
		
	}
	 
}
