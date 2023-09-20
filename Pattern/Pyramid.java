/*
         1 
        1 2 
       1 2 3 
      1 2 3 4 
     1 2 3 4 5 
 
         1 
        2 2 
       3 3 3 
      4 4 4 4 
     5 5 5 5 5 

         * 
        * * 
       * * * 
      * * * * 
     * * * * *    
     
    
       1 
      2 3 
     4 5 6 
    7 8 9 10  */  
package Pattern;
import java.util.*;

   public class Pyramid{
  
  public static void main (String[]args) {
    
  Scanner sc = new Scanner (System.in);
    
   int n,i,j;
   //num=1;
    
    System.out.print("Enter Num:");
    
       n=sc.nextInt ();
    
        for(i=1;i<=n;i++) {//for row print

	    for(j=1;j<=n-i;j++){ //for space print
	
	     System.out.print(" ");
	  
    }
	
         for(int k=1;k<=i;k++){ //for star print
	    
	          // System.out.print(k+" ");
	         //System.out.print (i + " ");
	         //System.out.print (num+ " ");
	         //num++;
        	 
	        System.out.print("* ");
        	 
    } 
 
            System.out.println ();

   } 
  } 
 
  } 
 