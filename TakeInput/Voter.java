package TakeInput;
import java.util.*;

public class Voter {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int age;
		System.out.print("Enter Your Age:");
		age=sc.nextInt();
		if(age>=18)
			System.out.print("Valid Voter");
		else 
			System.out.print("Invalid Voter");
			sc.close();
	}

}
