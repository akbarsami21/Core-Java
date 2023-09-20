package string;

import java.util.*;
public class stringbuffer {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		
		String name="akbar";
		StringBuffer sb=new StringBuffer(name);
		
//string ei new kichu add korte chaile ei method use kore		
		sb.append(" sami");
		System.out.println(sb);
//string er length set kore dite chaile mane koto tuk print korebe eta		
		sb.setLength(4);;
		System.out.println(sb);
//string reverse korte chaile		
		sb.reverse();
		System.out.println(sb);
		sc.close();
	}

}
