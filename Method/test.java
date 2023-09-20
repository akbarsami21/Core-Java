package Method;
import java.util.*;

public class test {

	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		reverse(n);
	}
static void reverse(int x) {
	     int rem,sum=0;
	     while(x!=0){
	       rem=x%10;
	        sum=sum*10+rem;
	         x=x/10;
	         }
	    System.out.print(sum);
	    
	}

}


