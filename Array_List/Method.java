package Array_List;

import java.util.ArrayList;
public class Method {
	public static void main(String[] args) {
		
		ArrayList<Integer> num=new ArrayList<>();
//add method use hoi value assign korar jonoo		
		num.add(30);
		num.add(40);
		num.add(50);
		num.add(60);
	System.out.println("Value:"+num);
		
//arraylist er value clear korar jonno clear method use hoi		
		//num.clear();
		
/*isEmpty use hoi arraylist ei value ache kina jodi value takhe 
  taile false and value na takhle true print hobe */
		
		boolean b=num.isEmpty();
		System.out.println("ArrayList has no value:"+b);

/* ei method use er maddome amra index ei emon kuno value ase kina check korte
  scacci setar jonno. jodi value ta takhe taile true and na takle false print
  hobe */
		
		boolean c=num.contains(30);
		System.out.println("\nValue is present:"+c);

/* jodi kuno valuer index jante chai taile amara indexOf method use kori
  ar (value) dibo */
		
		int x=num.indexOf(60);
		System.out.println("60 index is:"+x);
		
/* ArrayList er kuno value jodi replace korte chai taile set() use kori */
		
		num.set(3, 80);
		System.out.println("After Replace:"+num);
		
/* jodi kuno index er value jante chai taile amara get() method use kori
   ar (index no) dibo */
		
		int y=num.get(2);
		System.out.println("\nvalue of Index 2:"+y);
		
	}

}
