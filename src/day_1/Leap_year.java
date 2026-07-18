package day_1;

import java.util.Scanner;

public class Leap_year {
	int year;
	public void Check() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the year to check it's leap year or not.:");
		year = sc.nextInt();
		if(year%4==0) {
			System.out.println("Year is a leap year...");
		}else {
			System.out.println("Year is NOT a laep year...");
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Leap_year ch = new Leap_year();
		ch.Check();
		

	}

}
