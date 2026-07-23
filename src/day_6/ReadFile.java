package day_6;

import java.io.FileReader;
import java.io.IOException;

public class ReadFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileReader fr = new FileReader("student.txt");
		int ch;
		
		while((ch = fr.read())!=-1) {
			System.out.print((char)ch);
		}
		fr.close();
	}

}
