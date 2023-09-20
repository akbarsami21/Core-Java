package Array2D;


import java.util.*;
public class Sum {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int sum=0;
		int num[][]=new int [2][2];
		
		System.out.print("Enter Numbers:");
		for(int i=0;i<2;i++) {
			
			for(int j=0;j<2;j++) {
				
				num[i][j]=sc.nextInt();
				sum=sum+num[i][j];
			}
		}
		System.out.println("Sum:"+sum);
		sc.close();
	}

}
