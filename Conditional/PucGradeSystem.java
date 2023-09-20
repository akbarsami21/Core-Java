package Conditional;

import java.util.Scanner;

public class PucGradeSystem {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		float point;
		System.out.print("Enter Grade Point:");
		point=sc.nextFloat();
		
		if(point==4.00)
			System.out.println("You Got A+\nCongratulations For your Success");
		
		else if(point>=3.75 && point<4.00)
			System.out.println("You Got A");

		else if(point>=3.50 && point<3.75)
			System.out.println("You Got A-");
		
		else if(point>=3.25 && point<3.50)
			System.out.println("You Got B+");
		
		else if(point>=3.00 && point<3.25)
			System.out.println("You Got B");
		
		else if(point>=2.75 && point<3.00)
			System.out.println("You Got B-");
		
		else if(point>=2.50 && point<2.75)
			System.out.println("You Got C+");
		
		else if(point>=2.25 && point<2.50)
			System.out.println("You Got C");
		
		else if(point>=2.00 && point<2.25)
			System.out.println("You Got D");
		
		else if(point>=0.00 && point<2.00)
			System.out.println("You Are Fail\nBetter Luck Next & Do Hard Work");
		else
	     	System.out.println("You Type Wrong");
		
	sc.close();
		
	}

}
