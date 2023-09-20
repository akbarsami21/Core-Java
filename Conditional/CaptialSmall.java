package Conditional;

import java.util.*;
public class CaptialSmall {
	 public static void main(String[] args) {
		
		 Scanner input=new Scanner(System.in);
		 System.out.print("Enter Letter:");
		 char letter;
		 letter=input.next().charAt(0);
		 if(letter>='a' && letter<='z')
			 System.out.print("Small letter");
		 else 
			 
			 System.out.print("Capital letter");
		 input.close();
	}

}
