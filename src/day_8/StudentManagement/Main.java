package day_8.StudentManagement;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		StudentManager manager = new StudentManager();

		while (true) {

			System.out.println("\n===== STUDENT MANAGEMENT SYSTEM =====");
			System.out.println("1. Add Student");
			System.out.println("2. Display Students");
			System.out.println("3. Search Student");
			System.out.println("4. Delete Student");
			System.out.println("5. Exit");
			System.out.print("Enter Choice: ");

			int choice = sc.nextInt();
			sc.nextLine();

			switch (choice) {

			case 1:

				System.out.print("Enter Roll No: ");
				int rollNo = sc.nextInt();
				sc.nextLine();

				System.out.print("Enter Name: ");
				String name = sc.nextLine();

				System.out.print("Enter Email: ");
				String email = sc.nextLine();

				System.out.print("Enter Course: ");
				String course = sc.nextLine();

				Student student = new Student(rollNo, name, email, course);
				manager.addStudent(student);

				break;

			case 2:

				manager.displayStudents();

				break;

			case 3:

				System.out.print("Enter Roll No to Search: ");
				int searchRollNo = sc.nextInt();

				manager.searchStudent(searchRollNo);

				break;

			case 4:

				System.out.print("Enter Roll No to Delete: ");
				int deleteRollNo = sc.nextInt();

				manager.deleteStudent(deleteRollNo);

				break;

			case 5:

				System.out.println("Thank You!");
				sc.close();
				System.exit(0);

			default:

				System.out.println("Invalid Choice!");

			}
		}
	}
}