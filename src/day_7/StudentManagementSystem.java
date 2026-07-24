package day_7;

import java.util.*;

public class StudentManagementSystem {

    static Scanner sc = new Scanner(System.in);

    static List<Student> students = new ArrayList<>();

    public static void main(String[] args) {

        while (true) {

            System.out.println("\n===== Student Management System =====");

            System.out.println("1. Add Student");
            System.out.println("2. Display Students");
            System.out.println("3. Search Student");
            System.out.println("4. Update Student");
            System.out.println("5. Delete Student");
            System.out.println("6. Exit");

            System.out.print("Enter Choice : ");

            int choice = sc.nextInt();

            switch (choice) {

            case 1:
                addStudent();
                break;

            case 2:
                displayStudents();
                break;

            case 3:
                searchStudent();
                break;

            case 4:
                updateStudent();
                break;

            case 5:
                deleteStudent();
                break;

            case 6:
                System.exit(0);

            default:
                System.out.println("Invalid Choice");

            }

        }

    }

	public static void addStudent() {
		System.out.println("Enter your Roll no.: ");
		int roll = sc.nextInt();
		sc.nextLine();
		
		System.out.println("Enter your Name: ");
		String name = sc.nextLine();
		
		System.out.println("Enter your Age: ");
		int age = sc.nextInt();
		sc.nextLine();
		
		System.out.println("Enter your Course: ");
		String course = sc.nextLine();
		Student student = new Student(roll, name, age, course);
		
		boolean added = students.add(student);

		if (added) {
		    System.out.println("Student Added Successfully...");
		}
	}
	
	public static void displayStudents() {
		if(students.isEmpty()) {
			System.out.println("No Data Found!!!");
		}
		for(Student student : students) {
			System.out.println(student);
			System.out.println("--------------");
		}
	}
	
	public static void searchStudent() {
		System.out.println("Enter Roll no.: ");
		int roll= sc.nextInt();
		boolean found = false;
		for(Student student: students) {
			if(student.getRollNo()==roll) {
//				System.out.println("Roll no.: "+student.getRollNo());
//				System.out.println("Name : "+student.getName());
//				System.out.println("Age: "+student.getAge());
//				System.out.println("Course: "+student.getCourse());
				System.out.println(student);
				found =true;
				
				break;
			}
			
		}
		if(!found) {
			System.out.println("Student not Found!!!");
		}
	}
	
	public static void updateStudent() {
		System.out.println("Enter Student Roll no.: ");
		int roll = sc.nextInt();
		
		boolean found = false;
		
		for(Student student : students) {
			if(student.getRollNo()==roll) {
				System.out.println("Enter Name to Update: ");
				String name = sc.nextLine();
				student.setName(name);
				
				System.out.println("Enter Age to Update: ");
				int age = sc.nextInt();
				sc.nextLine();
				student.setAge(age);
				
				System.out.println("Enter Course to update: ");
				String course = sc.nextLine();
				student.setCourse(course);
				
				System.out.println("Student updated Successfully..");
				found=true;
				break;
			}
		}
		if(!found) {
			System.out.println("Student not Found!!!");
		}
	}
	
	public static void deleteStudent() {
		System.out.println("Enter Student Roll to delete: ");
		int roll = sc.nextInt();
		Student studentToRemove = null;
		boolean found = false;
		
		for(Student student : students) {
			if(student.getRollNo()==roll) {
				studentToRemove=student;
				found= true;
				break;
			}
		}
		 if (found) {

		        students.remove(studentToRemove);

		        System.out.println("Student Removed Successfully!");

		    } else {

		        System.out.println("Student Not Found!");

		    }
	}
	
	
}