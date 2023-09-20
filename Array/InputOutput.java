package Array;
import java.util.*;
public class InputOutput {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter Array Size:");
		int size=sc.nextInt();
		
		int Id[]=new int[size];
		
		System.out.println("\nEnter Your Id:");
		
		for(int i=0;i<size;i++) { //for take input from user
			Id[i]=sc.nextInt();
			
		}
		for(int i=0;i<size;i++) { //output
	  System.out.println("Your Id:"+i+"."+Id[i]); 
	  //i=index &index start from 0 in java and c/c++
		}
		sc.close();
	}

}
