package stringbuilder;

import java.util.*;
public class Reverse {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s1=sc.nextLine();
		StringBuilder sb=new StringBuilder(s1);
        sb.reverse();
		System.out.println(sb);
		
		}
    }
