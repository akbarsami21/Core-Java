package Loop;
import java.util.*;
public class Assignment12 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int m,n,i,sum=0;
		System.out.print("Enter Starting Num:");
		m=sc.nextInt();
		
		System.out.print("Enter Ending Num:");
		n=sc.nextInt();
		
		for(i=m;i<=n;i++) {
			if(i%2!=0)
			sum=sum+i;
		}
		System.out.print("Sum Of Odd Num:"+sum);
	}

}
