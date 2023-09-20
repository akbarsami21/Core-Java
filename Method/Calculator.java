package Method;


import java.util.*;
public class Calculator {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("first num:");
		int num1=sc.nextInt();
		
		System.out.print("Choose Operator(+,-,*,/):");
		char op=sc.next().charAt(0);
		
		System.out.print("second num:");
		int num2=sc.nextInt();
		
		if(op=='+') {
			int s=Sum(num1,num2);
			System.out.println("Sum:"+s);
		}
		else if(op=='-') {
			int t=Sub(num1,num2);
			System.out.println("Sub:"+t);
		}
		
		else if(op=='*') {
			int u=Mul(num1,num2);
			System.out.println("Mul:"+u);
				
			}
		
		else if(op=='/') {
			float v=div(num1,num2);
		System.out.println("Div:"+v);
		}
		
		System.out.println("\nThanks For Using");
		
	}
	
	static int Sum(int a,int b) {
		
		int sum=a+b;
		
		return sum;
	}
	
	
    static int Sub(int a,int b) {
		
		int sub=a-b;
		
		return sub;
	}
    
    static int Mul(int a,int b) {
		
		int Mul=a*b;
		
		return Mul;
	}
    
   static float div(int a,int b) {
		
		float div=(float)a/b;
		
		return div;
	}
	
}
