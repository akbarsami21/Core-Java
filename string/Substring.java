package string;

public class Substring {
	public static void main(String[] args) {
		
		String name1="My Name Is Akbar Sami";
		String name2="My Name Is Akbar Sami";
		
		System.out.println(name1);
		boolean check=name1.equals(name2);
		System.out.println("Name1=Name2:"+check);
		
		
//ei function kuno string teke sub string print kore		
		String name3=name1.substring(11,name1.length());
		
		System.out.println(name3);
	}

}
