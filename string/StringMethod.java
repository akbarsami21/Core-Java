package string;


public class StringMethod {
	
	public static void main(String[] args) {
		
	
		
		String s1="Bangladesh Is My Country.";
		String s2="And I Love My Country Very Much";
		
// concat method diye string add kore ektar sathe arekta		
		String s3=s1.concat(s2);
		System.out.println(s3);

/* startWint() and endWith() egulu diye check kore ami je 
word diye check korte sacci sei word diye suru and sesh hocce kina
jodi true print kore taile ami je word diye dekte sacci sei word diye
suru hocce*/
		boolean x=s3.startsWith("Bang");
		System.out.println(x);
		
	    x=s3.endsWith("ch");
		System.out.println(x);
		
		
/*string er koto index ei kun character ase seta chek korte chaile
charAt() ei method use korte hobe*/
		
        char ch=s1.charAt(2);
		System.out.println(ch);

//1 tomo index er value er ASCII code print korbe
		int value=s1.codePointAt(1);
		System.out.println(value);

//s1 er modde g koto tomo index ta print korbe
		int check=s1.indexOf('n');
		System.out.println(check);
		
//s1 er modde last n er koto index ta print korbe	
		check=s1.lastIndexOf('n');
		System.out.println(check);

//trim() ei method samner and seshr joto space ach eta remove kore dibe
		String country="   Bangladsesh   ";
	   String c1=country.trim();
	   System.out.println(c1);
	   
//replace(old value,new value) method er kaj holo string ei value replace kora	   
	   String c2=country.replace('n','a');
	   System.out.println(c2);
	   
//ei method ta bag kore de   
	   String str="Bangladesh is my country";
	   String []str1=str.split(" ");
		for(String y :str1) {
			System.out.println(y);
		}
	
	}

}
	


