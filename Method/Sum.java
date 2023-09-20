package Method;

import java.util.*;
public class Sum {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("enter first num:");
		int a=sc.nextInt();
		
		System.out.print("enter second num:");
		int b=sc.nextInt();
		
		int sum=GetSum(a,b);
		System.out.println("Additon:"+sum);
		
		SayHi();
		
		sc.close();
	}
	
	 static int GetSum(int a,int b){
	    	
	    	int sum=a+b;
	    	
	    	return sum;
	     }
	 
	 static void SayHi() {
		 
		 System.out.println("Thank For Using");
	 }

}
