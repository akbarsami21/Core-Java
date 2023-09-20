package Conditional;


import java.util.Scanner;
public class PosNeg {
  public static void main(String[] args) {
	
	  Scanner sc=new Scanner(System.in);
	  
	  System.out.print("Enter Number:");
	  
	  int num;
	  num=sc.nextInt();
	  
	  if(num<0)	
		  System.out.println("Negatve");
		  
		  else if(num==0)
			  System.out.println("Zero");
		  else
			  System.out.println("Positive");
	    sc.close();
	  
}
}
