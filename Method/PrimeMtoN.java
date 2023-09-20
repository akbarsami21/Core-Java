package Method;
import java.util.Scanner;
public class PrimeMtoN {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter First Num:");
		int firstN=sc.nextInt();
		System.out.print("Second Num:");
		int secondN=sc.nextInt();
		prime(firstN,secondN);
	}
	
	static void prime(int m,int n) {
		
		int i,j,count=0;
		System.out.print("Prime Num:");
		for(i=m;i<=n;i++) {
			for(j=2;j<i;j++) {
				if(i%j==0) {
				count++;
				break;
				}
			}
			if(count==0)
				System.out.print(i+" ");
			count=0;
		}
	}
}
