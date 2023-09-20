package Conditional;

import java.util.Scanner;

public class MaxMin {
	
	 public static void main(String[] args) {
		
		 Scanner sc=new Scanner(System.in);
      System.out.print("Enter Three Number:");
      int a,b,c;
      a=sc.nextInt();
      b=sc.nextInt();
      c=sc.nextInt(); 
		 
      if(a>b && a>c)
    	  System.out.printf("Maximum=%d",a);
      
      
      else if(b>a && b>c)
    	  System.out.printf("Maximum=%d",b);
      
       
      else
    	  System.out.printf("Maximum=%d",c);
      sc.close();
	}

}
