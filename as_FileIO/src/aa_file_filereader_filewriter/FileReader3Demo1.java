package aa_file_filereader_filewriter;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileReader3Demo1 {

	public static void main(String[] args) throws IOException {

		FileReader fr = new FileReader("abcd.txt");

		int i = fr.read();

		while (i != -1) {
			System.out.print((char) i);
			i = fr.read();
		}

		fr.close();

		File file = new File("abcd.txt");

		FileReader fr1 = new FileReader(file);

		char[] ch = new char[(int) file.length()];

		fr1.read(ch);

		for (char ch1 : ch) {
			System.out.print(ch1);
		}

		fr1.close();

	}

}
