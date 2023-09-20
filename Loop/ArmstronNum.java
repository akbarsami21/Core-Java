package Loop;
import java.util.*;
public class ArmstronNum {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n,temp,rem;
		double sum=0;
		System.out.print("Enter Num:");
		n=sc.nextInt();
		temp=n;
		while(temp!=0) {
			
			rem=temp%10;
			sum=sum+Math.pow(rem, 3);
			temp=temp/10;
			sc.close();
			
		}
		if(sum==n)
			System.out.println("Armstrong Number");
		else
			System.out.println("Not Armstrong Number");
	}

}
