package Conditional;
import java.util.*;
public class Assignment8 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		char ch1,ch2;
		System.out.print("Have you Completed Your Masters?(Y/y,N/n):");
		ch1=sc.next().charAt(0);
		
		System.out.print("Are You Fulent In English?(Y/y,N/n):");
		ch2=sc.next().charAt(0);
		
		if((ch1=='y'|| ch1=='Y')&& (ch2=='y'|| ch2=='Y'))
			System.out.println("You Are Eligible For Job Interview.");
		else
			System.out.println("Sorry.You Are Eligible For Job Interview.");
		sc.close();	}

}
