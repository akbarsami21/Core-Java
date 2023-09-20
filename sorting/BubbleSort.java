//Time Complexity  : O(n)
//Space Complexity : O(1)
package sorting;

import java.util.Scanner;

public class BubbleSort {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Array Size : ");
		int size = sc.nextInt();
		int[] arr = new int[size];
		int i, j, swap;
		for (i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		for (i = 0; i < arr.length - 1; i++) { //n
			swap = 0;
			for (j = 0; j < arr.length - 1 - i; j++) { //n
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
					swap = 1;
				}
			}
			if (swap == 0)
				break;
		}
		System.out.print("After Sorting : ");
		for (i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

	}
}
