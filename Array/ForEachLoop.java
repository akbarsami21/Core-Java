package Array;
import java.util.*;
public class ForEachLoop {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int size,sum=0;
		System.out.print("Enter Array Size:");
		size=sc.nextInt();
		int []num=new int[size];
		System.out.print("Enter Numbers:");
		
		for(int x:num) {
			x=sc.nextInt();
			sum=sum+x;
			
		}
		System.out.println("Sum:"+sum);
	}

}
