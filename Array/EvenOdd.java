package Array;
import java.util.*;
public class EvenOdd {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int i,size;
		
		System.out.print("Enter Array Size:");
		size=sc.nextInt();
		
		int []num=new int[size];
		System.out.print("Enter Number:");
		
		for(i=0;i<size;i++) {
			num[i]=sc.nextInt();
		}
		
	
		
		for( i=0;i<size;i++) {
			int n=num[i];
			
			if(n%2==0)
				System.out.println("Enen:"+n);
			
			else
				System.out.println("Odd:"+n);
		}
		
	}

}
