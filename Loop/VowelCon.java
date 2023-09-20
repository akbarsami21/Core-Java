package Loop;


public class VowelCon {
	public static void main(String[] args) {
	
		char letter;
		for(letter='a';letter<='z';letter++) {
			
			if(letter=='a' || letter=='e' || letter=='i' || letter=='o' || letter=='u' || letter=='A'||
					letter=='E' || letter=='I'|| letter=='O' || letter=='U')
				
				System.out.println("VOWEL:"+letter);
			else 
				System.out.println("Consonat:"+letter);
		}
           /*for(letter='A';letter<='Z';letter++) {
			
			if(letter=='a' || letter=='e' || letter=='i' || letter=='o' || letter=='u' || letter=='A'||
					letter=='E' || letter=='I'|| letter=='O' || letter=='U')
				
				System.out.println("VOWEL:"+letter);
			else 
				System.out.println("Consonat:"+letter);
		}*/
           
	}
	 
}
