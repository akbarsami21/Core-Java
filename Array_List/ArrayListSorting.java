package Array_List;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListSorting {

	public static void main(String[] args) {
		
		ArrayList<Integer> num=new ArrayList<>();
		
		num.add(5);
		num.add(6);
		num.add(8);
		num.add(9);
		num.add(7);
		
		System.out.println("Before Sorting:" +num);

/*jodi arraylist sorting korte chai taile Collection.sort
 class er use korte hobe, eta array list er value choto teke
 boro akare sajai dibe and tarpor array list print korle value
 gulu choto teke boro show korbe*/
		
		Collections.sort(num);
		System.out.println("\nAscendig:"+num);

/* sorting korar por value gulu ke jodi reverse korte chai taile
 nicher class ta use korte hobe */
		
		Collections.sort(num,Collections.reverseOrder());
		System.out.println("\nDecsendin:"+num);
		
	}
}
