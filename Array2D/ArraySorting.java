package Array2D;

import java.util.*;
public class ArraySorting {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int size,i;
		System.out.print("Enter Array Size:");
		size=sc.nextInt();
		
		int []num=new int[size];
		
		System.out.print("Enter Input:");
		for(i=0;i<size;i++) {
			num[i]=sc.nextInt();
		}
		Arrays.sort(num); //array sorting
		
		//for Ascending
		System.out.print("\nAscending:");
		for(i=0;i<size;i++) {
			System.out.print(num[i]+" ");
		}
		
		//for Descending
				System.out.print("\nDescending:");
				for(i=size-1;i>=0;i--) {
					System.out.print(num[i]+" ");
				}
	}

}
