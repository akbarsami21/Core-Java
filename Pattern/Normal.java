package Pattern;

public class Normal {
	
	public static void main(String[] args) {
		
		int i,j;
		for(i=1;i<=6;i++) {
			
			for(j=1;j<=8;j++) {
				
				if((i==2 && j==2)|| (i==2 && j==6) || (i==2 && j==7)|| (i==2 && j==8))
					System.out.print("*");
				else if((i==3 && j==2)|| (i==3 && j==7))
					System.out.print("*");
				else if((i==4 && j==2)|| (i==4 && j==7))
					System.out.print("*");
				
				else if((i==5 && j==2)|| (i==5 && j==3)|| (i==5 && j==4)|| (i==5 && j==6)
						||(i==5 && j==7) || (i==5 && j==8))
					System.out.print("*");
				else 
					System.out.print(" ");
				
			}
			System.out.println();
		}
	
          for(i=1;i<=6;i++) {
			
			for(j=1;j<=8;j++) {
				
				if((i==2 && j==2)|| (i==2 && j==6) || (i==2 && j==7)|| (i==2 && j==8))
					System.out.print("*");
				else if((i==3 && j==2)|| (i==3 && j==7))
					System.out.print("*");
				else if((i==4 && j==2)|| (i==4 && j==7))
					System.out.print("*");
				
				else if((i==5 && j==2)|| (i==5 && j==3)|| (i==5 && j==4)|| (i==5 && j==6)
						||(i==5 && j==7) || (i==5 && j==8))
					System.out.print("*");
				else 
					System.out.print(" ");
				
			}
			System.out.println();
		}
		
	}

}
