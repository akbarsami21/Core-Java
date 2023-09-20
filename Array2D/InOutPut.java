
package Array2D;

import java.util.*;
public class InOutPut {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int row,col,i,j;
		
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
           System.out.println("\n\nThe Matrix is:");
		for(i=0;i<row;i++) {   //input
			for(j=0;j<col;j++) {
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println();
		}
		
		
	}

}
