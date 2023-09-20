package Array_List;


import java.util.ArrayList;
import java.util.Iterator;
public class Declaration3 {
	
	public static void main(String[] args) {
		
	
		
		ArrayList<Integer> num=new ArrayList<>(5);
		System.out.print("Enter Value:");
		
		num.add(12);
		num.add(14);
		num.add(15);
		
		//3rd way to print
		Iterator itr=num.iterator();
		while(itr.hasNext()) {
			
			System.out.print(itr.next()+" ");
		}
		//for size
		System.out.print("\nSize:"+num.size());
		
		
	}

}
