/* *
   **
   ***
   ****  */

package Pattern;
import java.util.*;

public class HalfPyramid {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n,i,j;
		System.out.print("Enter Num:");
		n=sc.nextInt();
		for(i=1;i<=n;i++) {
			for(j=1;j<=i;j++) {
				
				System.out.print("*");
			}
			
			
			System.out.println();
		}
	}

}
