package stringbuilder;

public class Declaration {
	public static void main(String[] args) {
		
		StringBuilder sb=new StringBuilder("Sami");
		sb.append(" Lily");
		System.out.println(sb);
		

		System.out.println(sb.charAt(2));
		
		sb.reverse();
		System.out.println(sb);
		
		
	}

}
