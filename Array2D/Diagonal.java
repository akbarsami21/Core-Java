package Array2D;

import java.util.*;
public class Diagonal {
 public static void main(String[] args) {
	
	 Scanner sc=new Scanner(System.in);
	 int i,j,row,col;
	 int sumdiognal=0;
	 int uppersum=0;
	 int lowersum=0;
	 
	 System.out.println("Make Sure Row and Column Size Are Same.");
	 System.out.print("Enter Row Size:");
	 row=sc.nextInt();
	 System.out.print("Enter Column Size:");
	 col=sc.nextInt();
	 
	 int [][]A=new int[row][col];
	 //A matrix input
	 
	 for(i=0;i<row;i++) {
		 
		 for(j=0;j<col;j++) {
			 
			 A[i][j]=sc.nextInt();
		 }
		}
	 //output 
          for(i=0;i<row;i++) {
		 
		     for(j=0;j<col;j++) {
			 
			if(i==j)
				sumdiognal=sumdiognal+A[i][j];
			else if(i<j)
				uppersum=uppersum+A[i][j];
			else if(j<i)
				lowersum=lowersum+A[i][j];
		 }
		     
		}
	  
          System.out.println("Sum Of Diagonal:"+sumdiognal);
          System.out.println("Upper Triangle Element:"+uppersum);
          System.out.println("Lower Triangle Element:"+lowersum);
}
}
