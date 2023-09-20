package file;

import java.io.File;
import java.util.Scanner;

public class ReadFile {
	public static void main(String[] args) {

		try {
			File f1 = new File("C:/Users/mdsam/OneDrive/Documents/sami.txt");
			Scanner sc = new Scanner(f1);
			while (sc.hasNext()) {
				String name = sc.next();
				System.out.print(name + " ");
			}
			sc.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
