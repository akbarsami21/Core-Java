package Conditional;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		
		
		Scanner sc=new Scanner(System.in);
		int a,b;
		char op;
		System.out.print("Enter First Number:");
		a=sc.nextInt();
		
		System.out.print("Choose Operator(+,-,*/):");
		op=sc.next().charAt(0);
		System.out.print("Enter First Number:");
		b=sc.nextInt();
		float div=(float)a/b;
		
		switch(op){
		
		case '+' : System.out.print("Add:"+(a+b));
		break;
		case '-' : System.out.print("Sub:"+(a-b));
		break;
		case '*' : System.out.print("Mul:"+(a*b));
		break;
		case '/' : System.out.print("Div:"+ div);
		break;
		default:
		System.out.print("You Typed Wrong");
		
	}
		sc.close();
}
}