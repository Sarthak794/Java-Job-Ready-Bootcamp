package day_6;

import java.util.Scanner;

public class Finally_Block {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("Enter two numbers :");
			int n1 = sc.nextInt();
			int n2= sc.nextInt();
			int result = n1/n2;
			
			System.out.println("Result ="+result);
			
		}
		catch(ArithmeticException e) {
			System.out.println("Exception!");
			System.out.println(e);
			System.out.println("Number cannot be divided by zero!!!");
		}
		finally {
			System.out.println("This block always executes.");
			System.out.println("Program Ended...");
		}
		sc.close();
	}

}
