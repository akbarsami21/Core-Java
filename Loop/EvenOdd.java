package Loop;
import java.util.Scanner;
public class EvenOdd {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n,i;
		System.out.print("Enter Number:");
		n=sc.nextInt();
		for(i=1;i<=n;i++) {
			if(i%2==0)
				System.out.println("Even:"+i);
			else 
				System.out.println("Odd:"+i);
			sc.close();
		}
		
	}

}
