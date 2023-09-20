/* 

    1
   212
  32123
 4321234
543212345

 */

package Pattern;
import java.util.*;

public class PyramidPalinndrome {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int i,n;
		System.out.print("Enter Num:");
		n=sc.nextInt();
		for(i=1;i<=n;i++) { //row
			
			for(int j=1;j<=n-i;j++) { //space
				System.out.print(" ");
			}
			
			for(int j=i;j>=1;j--) {  //1st half
				System.out.print(j);
			}
			
			for(int j=2;j<=i;j++) { //2nd half
				System.out.print(j);
			}
			
			System.out.println();
			sc.close();
			
		}
		
	}

}
