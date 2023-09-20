package Loop;
import java.util.*;
public class SeriesMul {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n,i,mul=1;
		System.out.print("Enter Last Num:");
		n=sc.nextInt();
		for(i=1;i<=n;i++) {
			
			System.out.println(i);
			mul=mul*i;
			sc.close();
		}
		System.out.println("Total Mul:"+mul);
	}

}
