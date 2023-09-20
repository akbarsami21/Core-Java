package Array2D;

public class Declaration {
	public static void main(String[] args) {
	   int [][]MatrixA=new int [2][3];
	   MatrixA[0][1]=10;
	   MatrixA[1][1]=20;
	   MatrixA[1][2]=MatrixA[0][1]+MatrixA[1][1];
	   System.out.println("MatrixA[1][2]:"+MatrixA[1][2]);
	   System.out.println("Length:"+MatrixA.length);
	   
	}

}
