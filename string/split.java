package string;

import java.util.*;
public class split {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Write A Sentence:");
		String s=sc.nextLine();
		String []s1=s.split("\\s+");
		
		for(int i=0;i<s1.length;i++) {
			
			System.out.println(s1[i]);
		}
		sc.close();
	}

}
