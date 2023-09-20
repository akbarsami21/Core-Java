//Time Complexity  : O(n)
//Space Complexity : O(1)

package sorting;

public class InsertionSort {
	public static void main(String[] args) {

		int[] a = { 5, 3, 2, 10, 4 };
		int i, value, hole;
		for (i = 1; i < a.length; i++) { // n
			value = a[i];
			hole = i;
			while (hole > 0 && a[hole - 1] > value) { // n
				a[hole] = a[hole - 1];
				hole--;
			}
			a[hole] = value;
		}
		System.out.print("After Sorting : ");
		for (i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}

}
