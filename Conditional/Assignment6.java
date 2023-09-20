package Conditional;
import java.util.*;
public class Assignment6 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		char ch;
		System.out.print("Do You Love Java?(Y/y,N/n):");
		ch=sc.next().charAt(0);
		
		if(ch=='Y' || ch=='y')
			System.out.println("You Are A Java Lover.");
		else if(ch=='N'|| ch=='n')
			System.out.print("You Are Not A Java Lover.");
		else
			System.out.print("Wrong Typed");
		sc.close();
	}

}
