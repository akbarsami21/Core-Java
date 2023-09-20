package Array_List;

import java.util.ArrayList;

public class SomeMethod2 {
	public static void main(String[] args) {
		
		ArrayList<Integer> num1=new ArrayList<>();
		ArrayList<Integer> num2=new ArrayList<>();
		ArrayList<Integer> num3=new ArrayList<>();
		
		num1.add(10);
		num1.add(20);
		num1.add(30);
		num1.add(40);
		
		System.out.println("Number1: "+num1);
		
		num2.add(1);
		num2.add(2);
		num2.add(3);
		num2.add(4);
		
		System.out.println("Number1: "+num2);
		
/*ek arraylist er value onno arek arralist e add korte chaile 
 addAll(je list er value add korbo) use korte hobe	*/
		
		 num3.addAll(num1);
		System.out.println("Number3: "+num3);
		
/*ek arraylist er sob value onno arek arraylist er sob value mil ase kina
 check korar jonno ei method use kori,jodi true ase taile equal ar false asle
 equal na	*/
		
		boolean check=num1.equals(num3);
				System.out.println("Num1=Num2: "+check);
		
		
	}

}
