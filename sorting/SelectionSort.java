//Time Complexity  : O(n)
//Space Complexity : O(1)
package sorting;

public class SelectionSort {
	public static void main(String[] args) {

		int i, j, min_index;
		int[] data = { 32, 1, 3, 23, 44, 100, 7 };
		// outer loop to iterate all number
		for (i = 0; i < data.length; i++) { // n
			min_index = i;
			// inner loop to find the minimum index
			for (j = i + 1; j < data.length; j++) { // n
				if (data[j] < data[min_index])
					min_index = j;
			}
			// swap two number i,min_index
			int temp = data[i];
			data[i] = data[min_index];
			data[min_index] = temp;
		}

		// Print the sorting value
		for (i = 0; i < data.length; i++) {
			System.out.print(data[i] + " ");
		}

	}

}
