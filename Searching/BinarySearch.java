package Searching;

public class BinarySearch {
	public static void main(String[] args) {
		int[] A = { 3, 7, 8, 32, 51, 55, 57, 89, 91, 99 };
		int left = 0, right = A.length - 1, mid, item = 99;
		while (left <= right) {
			mid = ((left + right) / 2);
			if (A[mid] == item) {
				System.out.println("Value Found,Index of: " + mid);
				return;
			} else if (A[mid] < item) {
				left = mid + 1;

			} else if (A[mid] > item) {
				right = mid - 1;
			}
		}
	}

}
