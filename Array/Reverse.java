//probelm not solved

package Array;
import java.util.*;
public class Reverse {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int i,size,temp,rem,sum=0;
		
		System.out.print("Enter Array Size:");
		size=sc.nextInt();
		
		int []num=new int[size];
		
		for(i=0;i<size;i++) {
			num[i]=sc.nextInt();
		}
		
		for(i=0;i<size;i++) {
		   temp=num[i];
		  while(temp!=0) {
			  rem=temp%10;
			  sum=sum*10+rem;
			  temp=temp/10;
			  
		  }
			 
			  System.out.println(sum+",");
		     
		}
		
	}

}
