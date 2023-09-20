package Conditional;

import java.util.Scanner;

public class AgeStatus {

	 public static void main(String[] args) {
		
		 Scanner sc=new Scanner(System.in);
		 
		 int age;
		 
		 System.out.print("Enter Age:");
		 age=sc.nextInt();
		 
		 if(age<2)
			 System.out.println("Infant");
		 else if(age>=2 && age<10)
			 System.out.println("Child");
		 
		 else if(age>=10 && age<20)
			 System.out.println("Teenage");
		 
		 else if(age>=20 && age<30)
			 System.out.println("Adult");
		 
		 
		 else 
			 System.out.println("Old");
		 sc.close();
		
		 		 
	}
}
