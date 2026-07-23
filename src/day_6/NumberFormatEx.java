package day_6;

import java.util.Scanner;

public class NumberFormatEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		String str = sc.nextLine();
		
		try {
			int c = Integer.parseInt(str);
			System.out.println("Integer : "+c);
		}
		catch(NumberFormatException e) {
			System.out.println("Exception!");
			System.out.println(e);
			System.out.println("Invalid number format. Please enter a valid integer.");
		}
		sc.close();
	}

}
