package file;

import java.util.Formatter;

public class FileWrite {
	public static void main(String[] args) {
		try {
		Formatter foramtter =new Formatter("C:/Users/mdsam/OneDrive/Documents/Eclipse_Project/FILE/JavaFile/Third Semester/Data Structure.txt");
		foramtter.format("%s, %s\r\n",2253,"Akbar Sami");
		foramtter.close();
		}catch(Exception e) {
			System.out.println(e);
		}
	}

}
