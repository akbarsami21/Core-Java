package Array_List;

import java.util.ArrayList;
public class Declaration2 {
	public static void main(String[] args) {
		ArrayList<Integer> num=new ArrayList<>();
		
	  //ArrayListName.add(index,value);
		num.add(0, 10);  
		num.add(1, 20);
		num.add(2, 30);
		num.add(3, 40);
		//2nd way to print
		
		for(int x:num) {
			System.out.print(x+" ");
		
		}
		System.out.println();
		
		//for size 
		System.out.print("Size:"+num.size());
		
		
	}

}
