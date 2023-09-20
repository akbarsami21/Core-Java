package Pattern;
import java.util.*;
public class Pyramild2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int i,j,n;
		System.out.print("Enter Num:");
		n=sc.nextInt();
		for(i=1;i<=5;i++) {
			for(j=1;j<=n-i;j++) {
				System.out.print(" ");
			}
			for(j=1;j<=i;j++) {
				System.out.print(i+" ");
			}
			System.out.println();
		}
	
	}

}
