package ExceptionHomeWork;
import java.util.Scanner;

class NegativeIntegerException extends Exception{
	
	NegativeIntegerException(String msg){
		super(msg);
	}
}

public class PositiveInteger {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Number: ");
		int num=sc.nextInt();
		try {
			if(num<0)
				throw new NegativeIntegerException("Input Is Negative");
			System.out.println("Input Is Positive");
		}catch(NegativeIntegerException e1) {
			System.out.println(e1.getMessage());
		}
		
	}
}


