package Array2D;

public class Traversing {
	public static void main(String[] args) {
		//int matrix [][]= {{21,22,24},{20,34,18}};
		int matrix [][]= {{21,22,24},
						 {20,34,18}};
		for(int i=0;i<2;i++) {
			for(int j=0;j<3;j++) {
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println();
		}
	}

}
