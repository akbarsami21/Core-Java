package Conditional;

import java.util.Scanner;

public class TernaryOperator {
	
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		int x,y,max;
		System.out.print("Enter Two Number:");
		x=sc.nextInt();
		y=sc.nextInt();
		
		max=(x>y)? x:y;
		System.out.println("Maximum:"+max);
		sc.close();
		
		
		
	}
	
	
	

}
