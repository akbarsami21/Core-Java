package Searching;

public class LinerarSearching {
	public static void main(String[] args) {
		int[] arr = { 2, 5, 3, 7, 8, 90, 87 };
		int i, searchItem = 87;

		for (i = 0; i < arr.length; i++) {
			if (arr[i] == searchItem) {
				System.out.println("Find The Value And Index Is : " + i);
				return;
			}
		}
		System.out.println("Value Is Not Found");

	}
}
