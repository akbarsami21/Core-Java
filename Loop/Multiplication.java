package Loop;


import java.util.Scanner;

public class Multiplication {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int i,n;
		System.out.print("Enter Number:");
		n=sc.nextInt();
		for(i=1;i<=10;i++) {
			
			System.out.printf("%d x %d=%d\n",n,i,n*i);
			sc.close();
		}
     
	}
	
}
