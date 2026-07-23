package day_6;

import java.util.Scanner;

public class Divide_by_Zero {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Numerator :");
		int a = sc.nextInt();
		
		System.out.println("Enter the Denominator :");
		int b = sc.nextInt();
		
		try {
			int c = a/b;
			System.out.println("Division = "+c);
		}
		catch(ArithmeticException e) {
			System.out.println("Exception Caught!!!");
			System.out.println(e);
			System.out.println("Cannot divide by zero...");
		}
		

	}

}
