package day_6;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileWriter file = new FileWriter("student.txt");
		file.write("Name: Sarthak\n");
		file.write("Course : Java Full Stack Developer");
		file.close();
		System.out.println("Data written successfully.");

	}

}
