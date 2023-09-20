package Hashmap;

import java.util.HashMap;

public class CutomerList {
	public static void main(String[] args) {
		HashMap<Integer, String> customer = new HashMap<>();
		
		// put(),get()
        customer.put(101, "Akbar Sami");
		customer.put(102, "Sakib Chowdury");
		customer.put(103, "Habibul Bashar");
		customer.put(104, "Afifa Haque");

		System.out.println(customer.get(101));
		System.out.println(customer.get(102));
		System.out.println(customer.get(103));
		System.out.println(customer.get(104));

	}
}
