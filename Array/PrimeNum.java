//problem not solved
//print the number from multiple number using Array

package Array;
import java.util.*;

public class PrimeNum {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int i,size,n, count=0;
		System.out.print("Enter Size:");
		size=sc.nextInt();
		int []num=new int[size];
		System.out.print("Enter Numbers:");
		
		for(i=0;i<size;i++) {
			num[i]=sc.nextInt();
		
		for(i=0;i<size;i++) {
			  n=num[i];
			 
			for(int j=1;j<=n;j++) {
				if(n%j==0) {
					count++;
				    break;
				 
				}
				 if(count==0)
						System.out.println(n);
			}
			
		}
		}
			
		    
			    
		
	}

}
