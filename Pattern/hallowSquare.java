package Pattern;

import java.util.*;
public class hallowSquare {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int i,j,n;
		System.out.print("Enter Num:");
		n=sc.nextInt();
		
		for(i=1;i<=n;i++) {
			
			for(j=1;j<=n;j++) {
				if(i==1 || i==n/2 || i==n || j==1 || j==n/2 || j==n)
					System.out.print("*");
				else 
					System.out.print(" ");
				
			}
			
			System.out.println();
		}
          for(i=n-1;i>=1;i--) {
			
			for(j=1;j<=n;j++) {
				if(i==1 || i==n/2 || i==n || j==1 || j==n/2 || j==n)
					System.out.print("*");
				else 
					System.out.print(" ");
			}
			
			System.out.println();
		}
		
		
		
           
	}

}
