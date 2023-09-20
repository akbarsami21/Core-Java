
package Array2D;

import java.util.*;
public class IndexLoc {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int row,col,i,j,x;
		
		System.out.print("Enter Row Size:");
		row=sc.nextInt();
		
		System.out.print("Enter Column Size:");
		col=sc.nextInt();
		
		int [][]matrix=new int[row][col];
		
		for(i=0;i<row;i++) {   //input
			for(j=0;j<col;j++) {
				matrix[i][j]=sc.nextInt();
			}
		}
		   System.out.print("Enter a Number:");
           x=sc.nextInt();
           
		for(i=0;i<row;i++) {   //input
			for(j=0;j<col;j++) {
				if(matrix[i][j]==x)
			System.out.println("The Index Of x is:("+i+","+j+")");
			}
			//System.out.println();
			
		}
		
		
	}

}
