package file;

import java.io.File;

public class FileAndDir {
	public static void main(String[] args) {
		File dir = new File("C:/Users/mdsam/OneDrive/Documents/Eclipse_Project/FILE/JavaFile/Third Semester");
		dir.mkdir();
		String path = dir.getAbsolutePath();

		File file1 = new File(path + "/Digital Electronics.txt");
		File file2 = new File(path + "/Data Structure.txt");
		File file3 = new File(path + "/Object Oriented Programming.txt");

		try {
			file1.createNewFile();
			file2.createNewFile();
			file3.createNewFile();
			System.out.println("File Created Succesfully");

		} catch (Exception e) {
			System.out.println(e);
		}
		if(file1.exists() || file1.exists() || file1.exists()) {
			System.out.println("File Exist");
		}else 
			System.out.println("Not Exist");

	}

}
