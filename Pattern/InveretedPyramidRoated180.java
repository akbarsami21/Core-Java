/*  
    *
   **
  ***
 ****
*****  
      */

package Pattern;
import java.util.*;

public class InveretedPyramidRoated180 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n,i,j,k;
		System.out.print("Enter Num:");
		n=sc.nextInt();
		for(i=1;i<=n;i++) { //outer loop for total row
			
			for(j=1;j<=n-i;j++) { //inner loop for space
			System.out.print(" ");	
			}
			for(k=1;k<=i;k++) { //inner loop for star
				System.out.print("*");
			}
			
			
			
			System.out.println();
		}
	}

}
