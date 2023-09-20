package Loop;
import java.util.*;

public class StrongNum {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num,i,temp,rem,t=0;
		System.out.print("Enter Num:");
		num=sc.nextInt();
		temp=num;
		while(temp!=0) {
			
			rem=temp%10;
			int fact=1;
			for(i=rem;i>=1;i--) {
				fact=fact*i;
			}
			 t=t+fact;

			temp=temp/10;
			
			sc.close();
		}
		if(t==num)
			System.out.print("Strong Num");
		else 
			System.out.print("Not Strong");
		
	}

}
