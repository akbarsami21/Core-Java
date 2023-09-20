/* 
 1 
 2 3 
 4 5 6 
 7 8 9 10 
 11 12 13 14 15 
                  */




package Pattern;
import java.util.*;

public class FloytsTriangle {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int n,i,j,num=1;
		
		System.out.print("Enter Num:");
		n=sc.nextInt();
		for(i=1;i<=n;i++) {
			for(j=1;j<=i;j++) {
				System.out.print(num+" ");
				num++;
			}
			System.out.println();
			
		}
		
		
		
		
		
		
	}

}
