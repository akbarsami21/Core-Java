package linkedlist;

import java.util.LinkedList;

public class CountryName {
	public static void main(String[] args) {

		LinkedList<String> list = new LinkedList<>();
		list.add("Bangladesh");
		list.add("United State America");
		list.add("South Korea");
		list.add("Philipine");
		list.add("China");
		System.out.println(list);

		list.addFirst("Japan");
		list.addLast("Ukraine");
		System.out.println(list);

		list.removeFirst();
		list.removeLast();
		System.out.println(list);
		System.out.println("Size Of LinkedList              : " + list.size());

		boolean b = list.isEmpty();
		System.out.println("\n\nThe LinkedList is Empty         : " + b);
		boolean c = list.contains("China");
		System.out.println("China is Avaiable in LinkedList : " + c);
		String replace = list.set(3, "Canada");
		System.out.println(replace);
		System.out.println(list);
		System.out.println(list.get(2) + "\n");

		LinkedList<String> list1 = new LinkedList<>();
		list1.addAll(list);
		System.out.println(list1);

		boolean d = list.equals(list1);
		System.out.println("List1 and List are Equal : " + d);
		list1.clear();
		System.out.println(list1);

	}
}
