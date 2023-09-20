package Method;


import java.util.*;
public class EvenOdd {
	
    public static void main(String[] args) {
		
    	Scanner sc=new Scanner(System.in);
    	
    	System.out.print("Enter A Num:");
    	int num=sc.nextInt();
    	
    	
    	Evenodd(num);
    	
    	sc.close();
	}
    
    static void Evenodd(int a) {
    	
    	if(a%2==0)
    		System.out.println("even");
    	
    	else 
    		System.out.println("odd");
    }
    
    
}
