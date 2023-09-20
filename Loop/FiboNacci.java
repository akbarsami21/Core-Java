package Loop;

import java.util.*;

public class FiboNacci {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		int n,i;
		System.out.print("How Many Number:");
		n=sc.nextInt();
		
		int first=0,second=1,fibo;
		
		System.out.print(first+" "+second);
		for(i=3;i<=n;i++) {
			
			fibo=first+second;
			System.out.print(" "+fibo);
			first=second;
			second=fibo;
		    sc.close();
		}
	
	}

}
