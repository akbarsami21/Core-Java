package Loop;
import java.util.Scanner;

public class Marks {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	
	System.out.print("Enter Number Between(0&1):");
	int n,i,marks;
	n=sc.nextInt();
	if(n==1) {
		for(i=1;i<=2;i++) {
			
			System.out.print("Enter Your Marks:");
			marks=sc.nextInt();
			
			if(marks >=90)
			System.out.println("This is Good");
			else if(marks<=89 && marks>=60)
				System.out.println("This is also Good");
			else if(marks<=59 && marks>=0)
				System.out.println("This is Good as well");
			else 
				System.out.println("Error!");
			
			
}
		
}
	
	   else 
		System.out.println("Thank You");
	
}

}
