/*
    *
   ***
  *****
 *******
*********   */
package Pattern;

import java.util.*;

public class PyramidActual {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n,i,j;
		System.out.print("Enter Num:");
		n=sc.nextInt();
		for(i=1;i<=n;i++) { //row print
			for(j=1;j<=n-i;j++) {
				System.out.print(" ");
			}
			for(j=1;j<=2*i-1;j++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
	}

}
