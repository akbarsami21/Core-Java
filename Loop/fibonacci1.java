package Loop;

import java.util.*;
public class fibonacci1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter Num:");
		int n=sc.nextInt();
		
		int firstNum=0;
		int secondNum=1;
		
		System.out.print(firstNum+" ");
		System.out.print(secondNum);
		
		for(int i=3;i<=n;i++) {
			
			int fibo=firstNum+secondNum;
			System.out.print(" "+ fibo);
			firstNum=secondNum;
			secondNum=fibo;
			
		}
    }
}
