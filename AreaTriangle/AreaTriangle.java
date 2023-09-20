package AreaTriangle;

import java.util.Scanner;
public class AreaTriangle {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
	  System.out.print("Enter Base:");
	  int base=sc.nextInt();
      System.out.print("Enter Height:");
      int height=sc.nextInt();
      
      int AreaTriangle=(height*base)/2;
      
      System.out.printf("Area of Triangle=%d", AreaTriangle);
      
      sc.close();
	}

}
