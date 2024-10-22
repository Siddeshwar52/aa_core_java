package ac_printwriter;

import java.io.PrintWriter;

public class PrintWriterDemo {

	public static void main(String[] args) throws Exception {

		PrintWriter out = new PrintWriter("printwriterexample.txt");
		out.write(100);
		out.println(100);
		out.println(true);
		out.println("durga");
		out.flush();
		out.close();
	}
}

//FileWriter fw = new FileWriter("printwriterexample.txt");
//PrintWriter out = new PrintWriter(fw);

//d100
//true
//durga