package Calculator;

import java.util.*;
public class Calculator {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter First Number:");
		int num1=sc.nextInt();
		System.out.print("Enter Second Number:");
		int num2=sc.nextInt();
	   System.out.printf("Additon=%d\n",num1+num2);
	   System.out.printf("Substraction=%d\n",num1-num2);
	   System.out.printf("Multiplication=%d\n",num1*num2);
	   System.out.printf("Division=%.2f\n",(float)num1/num2);
		
	   sc.close();
	}

}
