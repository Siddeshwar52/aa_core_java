package aa_file_filereader_filewriter;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriter2Demo1 {

	public static void main(String[] args) throws IOException {

		//FileWriter fw = new FileWriter("abcd.txt");  
		FileWriter fw = new FileWriter("abcd.txt",true);  
		fw.write(100); // adding a single character
		fw.write("urga\nsoftwareSolutions");
		fw.write('\n');
		char[] ch1 = { 'a', 'b', 'c' };
		fw.write(ch1);
		fw.write('\n');
		fw.flush();
		fw.close();
		

	}

}
//default cd -> D:\workbenchs\core-java\as_FileIO
//FileWriter fw = new FileWriter("abcd.txt");  ->overriding
//FileWriter fw = new FileWriter("abcd.txt",true);  -> appending