package aa_file_filereader_filewriter;

import java.io.File;

public class File1Demo1 {

	public static void main(String[] args) {

		File f = new File("D:\\workbenchs\\core-java\\as_FileIO\\abc.txt");
		String[] s = f.list();
		
		System.out.println(s);

		for (String s1 : s) {
			System.out.println(s1);
		}

	}

}
