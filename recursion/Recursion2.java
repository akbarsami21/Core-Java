package recursion;

public class Recursion2 {
	static void print(int n) {
		if(n==6)
			return;
		System.out.println(n+" ");
		print(n+1);
	}
	static void print1(int n) {
		if(n==0)
			return;
		System.out.println(n+" ");
		print1(n-1);
	}
	public static void main(String[] args) {
		int n=1;
		System.out.println("1st:");
		print(n);
		int m=5;
		System.out.println("2nd:");
		print1(m);
	}

}
