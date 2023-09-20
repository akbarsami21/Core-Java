package ExceptionHomeWork;

import java.util.Scanner;

class InvalidEmailException extends Exception{
	InvalidEmailException(String email){
		super(email);
	}
}
public class InvalidEmail {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Email: ");
		String email=sc.nextLine();
		
		try {
			int atIndex=email.indexOf('@');
			int dotIndex=email.indexOf('.');
			
			if(atIndex<=1 || atIndex>dotIndex || dotIndex+4!=email.length() )
				throw new InvalidEmailException("Invalid Email Address");
			System.out.println("Valid Email Address");
		}catch(InvalidEmailException e1) {
			System.out.println(e1.getMessage());
		}
	}

}
