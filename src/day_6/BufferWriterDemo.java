package day_6;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferWriterDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedWriter bw = new BufferedWriter(new FileWriter("student.txt", true));
		
		bw.write("\nJava");
		bw.newLine();
		bw.append("Spring Boot");
		bw.newLine();
		bw.write("Hibernate");
		bw.close();
		System.out.println("Data written Successfully...");
	}

}
