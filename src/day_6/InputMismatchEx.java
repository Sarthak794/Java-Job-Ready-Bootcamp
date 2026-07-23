package day_6;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputMismatchEx {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		
		try {
			System.out.println("Enter your Age :");
			int age = sc.nextInt();
			System.out.println("Age : "+age);
		}
		catch(InputMismatchException e) {
			System.out.println("Exception!");
			System.out.println(e);
			System.out.println("Please Enter Valid Integer Age...");
		}
		sc.close();
	}

}
