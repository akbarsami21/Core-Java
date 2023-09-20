package Convereter;

import java.util.Scanner;

public class FarToCal {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		double f,cel;
		System.out.print("Enter Farengite Value:");
		
		f=sc.nextDouble();
		
		cel=(((f-32)*5)/9);
		
		System.out.printf("Celcius is:%.2f",cel);
		sc.close();
		
		
	}

}
