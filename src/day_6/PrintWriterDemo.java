package day_6;

import java.io.IOException;
import java.io.PrintWriter;

public class PrintWriterDemo {

		 public static void main(String[] args) throws IOException {

		        PrintWriter pw = new PrintWriter("student.txt");

		        pw.println("Sarthak");
		        pw.println(100);
		        pw.printf("Percentage : %.2f",92.45);

		        pw.close();
		        System.out.println("Data written successfully.");

	}

}
