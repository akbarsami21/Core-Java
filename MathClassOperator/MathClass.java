package javaPractice;

import java.util.Scanner;


public class MathClass {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int x,y;
		System.out.print("Enter Two Number:");
		x=sc.nextInt();
		y=sc.nextInt();
		int Max=Math.max(x, y);
		int Min=Math.min(x, y);
	    double Pow=Math.pow(x, y);
	    double root=Math.sqrt(x);
	    double pie=Math.PI;
	    
		System.out.println("Maximum:"+Max);
		System.out.println("Minimum:"+Min);
		
		System.out.println("Power:"+Pow);
		System.out.println("Root:"+root);
		System.out.println("Pie:"+pie);
		
		
		
		sc.close();
		
	}

}
