package linkedlist;

import java.util.LinkedList;

class Student {
	String name;
	int id;
	static String className = "Ten";

	Student(String name, int id) {
		this.name = name;
		this.id = id;

	}
}

public class StudentList {
	public static void main(String[] args) {

		LinkedList<Student> list = new LinkedList<>();
		Student s1 = new Student(" Sami   ", 15);
		Student s2 = new Student(" Rakib  ", 16);
		Student s3 = new Student(" Tanjim ", 17);
		Student s4 = new Student(" Rabbi  ", 18);
		Student s5 = new Student(" Kamrul ", 19);

		list.add(s1);
		list.add(s2);
		list.add(s3);
		list.add(s4);
		list.add(s5);
		System.out.println("  Name        ID        Class     ");
		System.out.println(" ------      ----      -------    ");

		for (Student x : list) {
			System.out.println(x.name + "      " + x.id + "         " + x.className);
		}
		

	}
}
