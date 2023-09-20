package Array_List;

import java.util.ArrayList;
public class RemoveValue {
  public static void main(String[] args) {
	
	  ArrayList<Integer> num=new ArrayList<>();
	  num.add(50);   //0 index
	  num.add(60);  //1 index
	  num.add(70); //2 index
	  num.add(80); //3 index
	  
	  System.out.println("Before Remove:"+num);
	  num.remove(3); //remove 3 index value
	  System.out.println("After Remove 3rd Index:"+num);
	  num.removeAll(num);
	  System.out.println("All Remove:"+num);
	  
}
}
