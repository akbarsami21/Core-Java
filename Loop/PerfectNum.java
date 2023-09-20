package Loop;
import java.util.*;

public class PerfectNum {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int n,i,sum=0,rem;
		n=sc.nextInt();
		for(i=1;i<n;i++) {
			
			rem=n%i;
			if(rem==0)
				sum=sum+i;
			sc.close();
			
		}
		if(sum==n)
			System.out.println("Perfect Number");
		else 
			System.out.println("Not Perfect");
		
	}

}
