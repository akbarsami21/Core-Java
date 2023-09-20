package Array2D;

import java.util.*;
public class ArrayOutput {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int row,col,i,j,k=0;
		System.out.print("Enter Row Size:");
		row=sc.nextInt();	
		
		System.out.print("Enter Column Size:");
		col=sc.nextInt();	
		
		int [][]num=new int [row][col];
		
		//input
		for(i=0;i<row;i++) {
			for(j=0;j<=i;j++) {
				
				num[i][j]=k;
				k++;
			}
		}
		
		//output
		  for(i=0;i<row;i++) {
			   for(j=0;j<=i;j++) {
				
				   System.out.print(" "+num[i][j]);
				}
			   System.out.println();
		}
		  
		  
	}

}
