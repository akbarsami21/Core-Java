package Loop;

public class While {
	
	public static void main(String[] args) {
		
		int i,sum=0;
		i=5;
		while(i<=100) {
			
			sum=sum+i;
			i=i+5;
		}
		System.out.println(sum);
	}

}
