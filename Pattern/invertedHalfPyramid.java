/* *****
   ****
   ***
   **
   * 
 */

package Pattern;
import java.util.*;

public class invertedHalfPyramid {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int i,n,j;
		System.out.print("Enter Num:");
		n=sc.nextInt();
		for(i=n;i>=1;i--) {
			for(j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			
			System.out.println();
		}
		
	}

}
