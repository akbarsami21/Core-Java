package Loop;
import java.util.Scanner;
public class PrimeNumber {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		int m,n,count=0;
		System.out.print("Enter First Num:");
		m=sc.nextInt();
		System.out.print("Enter Second Num:");
		n=sc.nextInt();
		
		for(int i=m;i<=n;i++) {
			
			for(int j=2;j<=i-1;j++) {
				if(i%j==0) {
					count++;
					
				    break;
				}
			}
			if(count==0)
				System.out.println(i);
			
			    count=0;
			    
		}
	
		
	}
	
}

