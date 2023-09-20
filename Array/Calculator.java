package Array;
import java.util.*;
public class Calculator {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int x[]=new int[2];
		System.out.print("Enter First Num:");
		x[0]=sc.nextInt();
		System.out.print("Enter Second Num:");
		x[1]=sc.nextInt();
	
		System.out.println("Sum:"+(x[0]+x[1]));
		System.out.println("Sub:"+(x[0]-x[1]));
		System.out.println("Mul:"+x[0]*x[1]);
		System.out.println("Div:"+x[0]/x[1]);
		
		sc.close();
	}

}
