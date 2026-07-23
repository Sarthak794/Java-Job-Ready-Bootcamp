package day_6;

import java.io.File;
import java.io.IOException;

public class CreateFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File file = new File("student.txt");
			
		if(file.createNewFile()) {
			System.out.println("File Created...");
		}
		else {
			System.out.println("File already Exist!!");
		}
		

	}

}
