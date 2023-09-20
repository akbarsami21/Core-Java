package file;

import java.io.File;

public class CreateDirectory {
	public static void main(String[] args) {
		File dir = new File("C:/Users/mdsam/OneDrive/Documents/Eclipse_Project/FILE/JavaFile/Person");
		dir.mkdir();
		String location = dir.getAbsolutePath();// folder kon location ei ache check kora
		System.out.println("Folder Location: " + location);
		System.out.println("Folder Name    : " + dir.getName());

	}

}
