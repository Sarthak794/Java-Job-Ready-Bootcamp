package day_6;

import java.io.File;
import java.io.IOException;

public class FileExist {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File file = new File("student.txt");
		if(file.exists()) {
			System.out.println("File Exists");
			System.out.println(file.getAbsolutePath());
			System.out.println(file.getName());
		}
		else {
			System.out.println("File not found!!");
		}

	}

}
