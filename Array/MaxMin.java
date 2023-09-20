package Array;
import java.util.*;
public class MaxMin{
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int i,size;
		System.out.print("Enter How Many Digit You Wanna type:");
		size=sc.nextInt();
		int num[]=new int[size];
		
		System.out.print("Enter Numbers:");
		
		for(i=0;i<size;i++) {
			num[i]=sc.nextInt();
		}
		
		//its class works for find the maximum from multiple number
        int max=Integer.MAX_VALUE;
      //its class works for find the minimum from multiple number
		int min=Integer.MIN_VALUE;
		
		for(i=0;i<size;i++) {
			if(num[i]<max) 
				max=num[i];
			
			else if(num[i]>min)
			  min=num[i];
			}
		
		System.out.println("Maximum:"+min);
		System.out.println("Minumum:"+max);
		
	}

}