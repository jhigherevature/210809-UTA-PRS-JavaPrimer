package filestreams;

import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.IOException;

/*
 * Most streams in Java come from the Java.io package
 * 
 * Streams are entities that look at data from a source
 * location and then can produce some output to a target
 * location. Generally, when using Streams you can also
 * change the output of the Stream data to a degree using
 * some form of intermediary operations. Streams do not
 * alter the original source data! 
 */
public class StreamSimulator {
	public static String filePath = "files/myFile.txt";
	
	public static void main(String[] args) {
		System.out.println("START OF APPLICATION");
		try {
			fosExample();
			fisExample();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("END OF APPLICATION");
	}
	
	public static void fosExample() throws IOException {
		FileOutputStream fos = new FileOutputStream(filePath);
		/*
		 * Outer loop added so that we print multiple lines
		 * of A -> Z
		 */
		for (int i = 65; i <= 70; i++) {
			for (char letter = (char)i; letter <= 'Z'; letter++) {
				fos.write(letter);
			}
			fos.write('\n');
		}
		
		// streams are resource intensive, and as such we should close them
		if (fos != null)
			fos.close();
	}
	
	public static void fisExample() throws IOException {
		FileInputStream fis = new FileInputStream(filePath);

		/*
		 * input is a representation for the data we are
		 * reading from our file 
		 */
		byte input;
		while((input = (byte)fis.read()) != -1 ) {
			System.out.print((char)input);
		}
		System.out.print("\n");
		
		// streams are resource intensive, and as such we should close them		
		if (fis != null)
			fis.close();
	}
}
