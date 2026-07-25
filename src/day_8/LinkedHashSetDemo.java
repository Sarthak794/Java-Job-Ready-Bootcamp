package day_8;
import java.util.*;
public class LinkedHashSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashSet<String> students = new LinkedHashSet<>();
		students.add("Sarthak");
		students.add("Rahul");
		students.add("Vijay");
		students.add("Sarthak");
		
		System.out.println(students);
		
		for(String student: students) {
			System.out.println(student);
		}
		int count = 0;

		for(String student : students) {

		    if(count == 1) {
		        System.out.println(student);
		        break;
		    }

		    count++;
		}
	}

}
