package string;

import java.util.*;
public class Declaration2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Your Name:");
		String name=sc.nextLine();
		System.out.println("yourName:"+name);
		System.out.println(name.toUpperCase());
		System.out.println(name.toLowerCase());
		sc.close();
	}

}
