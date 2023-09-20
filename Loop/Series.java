package Loop;
import java.util.*;
public class Series {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int m,i,sum=0;
		System.out.print("Enter Last Num:");
		m=sc.nextInt();
		for(i=1;i<=m;i++) {
			System.out.println(i+"X"+i+"="+i*i);
			sum+=i*i;
			sc.close();
		}
		System.out.println("------");
		System.out.println("Sum:"+sum);
		
	}

}
