package string;

import java.util.*;
public class Palindrome {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter A String:");
		String name=sc.next();
		
		StringBuffer sb=new StringBuffer(name);
		
		String s2=sb.reverse().toString();
	 
	   if(name.equals(s2))
		   System.out.println("Palindrome");
	   else
		   System.out.println("Not Palindrome");
		sc.close();
	}

}
