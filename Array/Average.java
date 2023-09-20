package Array;
import java.util.*;
public class Average {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int size,i;
	    double sum=0;
		System.out.print("Enter Array Size:");
		size=sc.nextInt();
		double[]num=new double[size];
		
		System.out.print("Enter Numbers:");
		for(i=0;i<size;i++) {
			num[i]=sc.nextDouble();
		}
		for(i=0;i<num.length;i++) {
			sum=sum+num[i];
		}
		double avg=sum/num.length;
		
	}

}
