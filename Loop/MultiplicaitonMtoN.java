package Loop;

import java.util.*;

public class MultiplicaitonMtoN {
 public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int m,n,i,j;
	System.out.print("Enter Number Initial Num:");
	m=sc.nextInt();
	System.out.print("Enter Number Final Num:");
	n=sc.nextInt();
	if(m<n) {
	for(i=m;i<=n;i++) {
		for(j=1;j<=10;j++) {
			
			System.out.println(i+" X "+j +"="+i*j);
			
		}
		 System.out.println();
	}
	}
	else
	    System.out.println("Please Type First Number Bigger Than Second Number");  
}
}
