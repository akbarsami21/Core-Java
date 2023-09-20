package Loop;

import java.util.*;

public class SumDigit {
 public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	
	int num,sum=0,temp,rem;
	  			System.out.print("Enter Num:");
	        num=sc.nextInt();
	        temp=num;
	        while(temp!=0) {
	        	
	        	rem=temp%10;
	        	sum=sum+rem;
	        	temp=temp/10;
	        	sc.close();
	        }
	
	        System.out.print("Sum Of Digit:"+sum);
	
}
}
