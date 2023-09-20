/*
1st

    *****
   *****
  *****
 *****
*****     

2nd

*****
 *****
  *****
   *****
    *****



*/
package Pattern;
import java.util.*;
public class SolidRoomBus{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int i,j,n;
		System.out.print("Enter Num:");
		n=sc.nextInt();
	//1st start
	for(i=1;i<=n;i++) { //row print
			for(j=1;j<=n-i;j++) { //space print
				System.out.print(" ");
			}
			for(j=1;j<=n;j++) { //star print
				System.out.print("*");
			}
			
			
			
			System.out.println();
		} //1st end
		
		//2nd start
	/*	for(i=n;i>=1;i--) { //row print
			for(j=1;j<=n-i;j++) { //space print
				System.out.print(" ");
			}
			for(j=1;j<=n;j++) { //star print
				System.out.print("*");
			} 
			
			
			
			System.out.println();
		}  */ //2nd end
	}

}
