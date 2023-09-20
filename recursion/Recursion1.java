package recursion;

public class Recursion1 {
	static void printsum(int i,int n,int sum) {
		if(i==n){
			sum=sum+i;
			System.out.println(sum);
			return;
		}else{
			sum=sum+i;
			printsum(i+1,n,sum);
		}
	}
	public static void main(String[] args) {
		int n=7;
		printsum(1,n,0);
	}

}
