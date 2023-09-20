package exceptionhandling;

public class Nullpointerexception {

	public static void main(String[] args) {

		try {
			String name = null;
			System.out.println("First Index Value : " + name.charAt(0));
		} catch (NullPointerException e) {
			System.out.println("Exception : " + e);
			
		}
		
	}
}
