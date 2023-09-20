package string;

import java.util.*;
public class CompareString {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter First String:");
		String name1=sc.nextLine();
		
		System.out.print("Enter Second String:");
		String name2=sc.nextLine();
		
		if(name1.compareTo(name2)==0)
			System.out.println("They Are Equal");
		else
			System.out.println("They Are Not Equal");
		
		sc.close();
		}

}
