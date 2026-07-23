package day_6;

import java.io.File;
import java.io.IOException;

public class DeleteFile {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		File file = new File("student.txt");
		
		if(file.delete()) {
			System.out.println("File Deleted Successfully..");
		}else {
			System.out.println("Error!! Cannot Delete ");
		}

	}

}
