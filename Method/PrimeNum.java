package Method;
import java.util.Scanner;
public class PrimeNum {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Num:");
		int num=sc.nextInt();
		prime(num);
	}
	
	static void prime(int n) {
		int count=0;
		
		for(int i=2;i<n;i++){
			if(n%i==0)
				count++;
	}
		if(count==0)
			System.out.print("Prime Number");
		else 
			System.out.println("Not Prime");
	
	}
}
