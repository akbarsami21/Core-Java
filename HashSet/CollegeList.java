package HashSet;

import java.util.HashSet;

public class CollegeList {
	public static void main(String[] args) {
		HashSet<String> college = new HashSet<>();
		college.add("Cda Public School And College");
		college.add("BAF Saheen College");
		college.add("Cantonment Public School And College");
		college.add("Bakolia Goverment College");
		college.add("Quaish Buricchar S.M City Corporation College");

		System.out.println(college);
		for (String x : college) {
			System.out.println(x);

		}
		System.out.println(college.size());

	}

}
