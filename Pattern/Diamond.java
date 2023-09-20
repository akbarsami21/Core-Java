/*
    *
   ***
  *****
 *******
*********
 *******
  *****
   ***
    *
         */

package Pattern;
import java.util.*;

public class Diamond {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n,i,j;
	System.out.print("Enter Num:");
	n=sc.nextInt();
	for(i=1;i<=n-1;i++) { //row print
		
		for(j=1;j<=n-i;j++) {//Space print
			System.out.print(" ");
		}
		
		for(j=1;j<=2*i-1;j++) { //star print
			System.out.print("*");
		}
		
		System.out.println();
	}
	    for(i=n;i>=1;i--) { //row print
		
		for(j=1;j<=n-i;j++) { //space print
			System.out.print(" ");
		}
		
		for(j=1;j<=2*i-1;j++) { //star print
			System.out.print("*");
		}
		
		System.out.println();
		sc.close();
	}
}
}
