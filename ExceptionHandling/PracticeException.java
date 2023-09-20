package exceptionhandling;

import java.util.Scanner;

class NegInputException extends Exception{
	NegInputException(String msg){
		super(msg);
	}
}
public class PracticeException {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		
		try {
			if(num<0) {
				throw new NegInputException("input is negative");
			}
			System.out.println("input is positive");
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}finally {
			
			System.out.println("hi");
			
		}
	}

}
