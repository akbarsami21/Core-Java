package TakeInput;

import java.util.Scanner;

public class Product {
	public static void main(String[] args) {
		
		

        Scanner sc=new Scanner(System.in);
        int id;
       
        System.out.print("Id:");
        id=sc.nextInt();
        
        System.out.print("Tittle:");
        String tittle=sc.next();
        
        System.out.print("Price:");
        String price=sc.nextLine();
        
        System.out.print("Description:");
        String description=sc.nextLine();
        
        System.out.print("Category:");
        String category=sc.next();
        
         System.out.println("ID:"+id);
         System.out.println("Tittle"+tittle);
         System.out.println("Price:"+price);
         System.out.println("Description:"+description);
         System.out.println("Category:"+category);
        
        sc.close();
      

}
}