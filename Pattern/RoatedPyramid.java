/*  1 2 3 4 5 
     1 2 3 4 
      1 2 3 
       1 2 
        1 
        
     5 5 5 5 5 
      4 4 4 4 
       3 3 3 
        2 2 
         1 
         
         1 2 3 
          4 5 
           6 
        
        
     * * * * * 
      * * * * 
       * * * 
        * * 
         *     */

package Pattern;
import java.util.*;
public class RoatedPyramid {
	 public static void main (String[]args) {
	
	  Scanner sc=new Scanner(System.in);
	    
	   int n,i,j;
	    //int num=1;
	    
	    System.out.print("Enter Num:");
	    
	       n=sc.nextInt();
	    
	        for(i=n;i>=1;i--) {//for row print

		    for(j=1;j<=2*n-i;j++){ //for space print
		
		     System.out.print(" ");
		  
	    }
		
	         for(int k=1;k<=i;k++){ //for star print
		    
		           //System.out.print(k+" ");
		         //System.out.print (i + " ");
		         //System.out.print (num+" ");
		          // num++;
		        System.out.print("* ");
	 
	    } 
	 
	            System.out.println ();

	   } 
	  } 
	 
	  } 

