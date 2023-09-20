package Array;
import java.util.*;
public class IndexPrint{
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter Array Size:");
		int size=sc.nextInt();
		
		int Id[]=new int[size];
		
		System.out.println("\nEnter Your Id:");
		
		for(int i=0;i<size;i++) { //for take input from user
			Id[i]=sc.nextInt();
			
		}
		System.out.print("Enter num:");
		int x=sc.nextInt();
		for(int i=0;i<size;i++) { //output
			if(x==Id[i])
				System.out.println("Index:"+i);
		}
		sc.close();
	}

}
