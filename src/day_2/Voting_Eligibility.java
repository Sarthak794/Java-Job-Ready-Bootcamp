package day_2;

import java.util.Scanner;

public class Voting_Eligibility {
	
	int age;
	Scanner sc = new Scanner(System.in);
	
	void Check_Eligibility() {
		System.out.println("Enter your Age:");
		age = sc.nextInt();
		
		if(age>=18) {
			System.out.println("Your are Eligible for Voting...");
		}
		else {
			System.out.println("NOT Eligible...");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Voting_Eligibility p = new Voting_Eligibility();
		p.Check_Eligibility();

	}

}
