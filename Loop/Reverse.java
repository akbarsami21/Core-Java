package Loop;

import java.util.*;

public class Reverse {

	 public static void main(String[] args) {
		
		 Scanner sc=new Scanner(System.in);
		 int num,temp,rem,sum=0;
		 System.out.print("Enter Num:");
		 num=sc.nextInt();
		 temp=num;
		 while(temp!=0) {
			 
			 rem=temp%10;
			sum=sum*10+rem;
			 temp=temp/10;
			 sc.close();
			 
		 }
		 
		System.out.print("Reverse:"+sum);
		
	}
}
