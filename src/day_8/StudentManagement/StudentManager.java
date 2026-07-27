package day_8.StudentManagement;
import java.util.*;


public class StudentManager {
	   private ArrayList<Student> students;

	    private HashSet<String> emails;

	    private LinkedHashSet<Integer> registrationOrder;

	    private TreeSet<Integer> rollNumbers;
	    
	    public StudentManager() {

	        students = new ArrayList<>();

	        emails = new HashSet<>();

	        registrationOrder = new LinkedHashSet<>();

	        rollNumbers = new TreeSet<>();
	    }
	    
	    public void addStudent(Student student) {

	        if (emails.contains(student.getEmail())) {
	            System.out.println("Email already exists!");
	            return;
	        }

	        if (rollNumbers.contains(student.getRollNo())) {
	            System.out.println("Roll Number already exists!");
	            return;
	        }

	        students.add(student);
	        emails.add(student.getEmail());
	        rollNumbers.add(student.getRollNo());
	        registrationOrder.add(student.getRollNo());

	        System.out.println("Student added successfully!");
	    }
	    
	    public void displayStudents() {
	    	if(students.isEmpty()) {
	    		System.out.println("No Student Data Found!!!");
	    		return;
	    	}
	    	
	    	for(Student s : students) {
	    		System.out.println(s);
	    		System.out.println("-----------");
	    	}
	    }
	    
	    public void searchStudent(int rollNo) {
	    	boolean found = false;
	    	if(students.isEmpty()) {
	    		System.out.println("No Student Data Found!!!");
	    		return;
	    	}
	    	for(Student s : students) {
	    		if(s.getRollNo()== rollNo) {
	    			System.out.println(s);
	    			found = true;
	    			break;
	    		}
	    	}
	    	if(!found) {
	    		System.out.println("Student Not Found!!!");
	    		return;
	    	}
	    }
	    
	    public void deleteStudent(int rollNo) {

	        if (students.isEmpty()) {
	            System.out.println("No Data Found!!!");
	            return;
	        }

	        Student studentToRemove = null;

	        for (Student s : students) {
	            if (s.getRollNo() == rollNo) {
	                studentToRemove = s;
	                break;
	            }
	        }

	        if (studentToRemove == null) {
	            System.out.println("Student Not Found!!!");
	            return;
	        }

	        students.remove(studentToRemove);
	        emails.remove(studentToRemove.getEmail());
	        rollNumbers.remove(studentToRemove.getRollNo());
	        registrationOrder.remove(studentToRemove.getRollNo());

	        System.out.println("Student Removed Successfully...");
	    }
}
