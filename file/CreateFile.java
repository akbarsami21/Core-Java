package file;

import java.io.File;

public class CreateFile {
	public static void main(String[] args) {
		File f1 = new File("C:/Users/mdsam/OneDrive/Documents/Eclipse_Project/FILE/JavaFile/Person/student.txt");
		File f2 = new File("C:/Users/mdsam/OneDrive/Documents/Eclipse_Project/FILE/JavaFile/Person/teacher.txt");

		try {
			f1.createNewFile();
			f2.createNewFile();
			System.out.println("File Created SuccesFully");
		} catch (Exception e) {
			System.out.println(e);
		}
		
		/*if(f2.delete()) {
			System.out.println(f2.getName()+" Deleted");
		}*/

	}

}
