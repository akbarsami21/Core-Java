package Conditional;

import java.util.Scanner;

public class LeapYear {
	
	 public static void main(String[] args) {
		
		 Scanner sc=new Scanner(System.in);
		 int year;
		 System.out.print("Enter Year:");
		 year =sc.nextInt();
		 if(year%4==0 || (year%100==0 && year%400!=0))
			 System.out.print("Leap Year");
		 
		 else 
			 System.out.print("Not Leap Year");
		 
		 sc.close();
	}
	 
}
