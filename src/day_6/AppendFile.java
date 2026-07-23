package day_6;

import java.io.FileWriter;
import java.io.IOException;

public class AppendFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileWriter fw = new FileWriter("student.txt",true);
		fw.append("\nCity : Pune");
		fw.close();
		System.out.println("Data Appended Successfully..");

	}

}
