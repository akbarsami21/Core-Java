package Array2D;

import java.util.*;
public class MatrixSum {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int [][]a=new int[3][3];
		int [][]b=new int[3][3];
		int i,j;
		
		//a matrix input
		  System.out.println("Enter A Matrix Value:\n");
		  
		   for(i=0;i<3;i++) {
			
			for(j=0;j<3;j++) {
				
				System.out.printf("A[%d][%d]=",i,j);
				a[i][j]=sc.nextInt();
			}
			
		}
		    System.out.println("\n");
		
		    //b matrix input
		    System.out.println("Enter B Matrix Value:\n");
		    
            for(i=0;i<3;i++) {
			
			for(j=0;j<3;j++) {
				
				System.out.printf("B[%d][%d]=",i,j);
				b[i][j]=sc.nextInt();
			}
			
		}
            
            System.out.println("\n");
          //a matrix output
            System.out.println("A=");
 		   for(i=0;i<3;i++) {
 			
 			for(j=0;j<3;j++) {
 				
 				System.out.print("\t"+a[i][j]);
 			}
 			 System.out.println("\n");
 		}
 		   
 		    System.out.print("\n\n");
 		
 		    //b matrix output
 		    System.out.print("B=");
             for(i=0;i<3;i++) {
 			
 			for(j=0;j<3;j++) {
 				
 			  System.out.print("\t"+b[i][j]);
 			}
 			  System.out.println("\n");
 		}
             System.out.println("\n\n");
             
             //sum two matrix a+b
             System.out.println("Sum of Two Matrix:\n\n");
             for(i=0;i<3;i++) {
            	 
            	 for(j=0;j<3;j++) {
            		 
            		//for sub,mul,div just chane the operator
            		 System.out.print("\t"+(a[i][j]+b[i][j]));
            	 }
            	 System.out.println("\n");
             }
	}

}
