package ExceptionHomeWork;

import java.util.Scanner;

class InvalidPhoneNumberException extends Exception{
	
	InvalidPhoneNumberException(String number){
		super(number);
	}
}
public class PhoneNumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Phone Number : (+880) ");
		String phoneNum=sc.nextLine();
		try {
			if((phoneNum.charAt(0)!='1') || phoneNum.length()!=10 ) {
				throw new InvalidPhoneNumberException("Invalid Phone Number");
			}
			System.out.println("Valid Number");
		}catch(InvalidPhoneNumberException e1) {
			System.out.println(e1.getMessage());
		}
	}
}
