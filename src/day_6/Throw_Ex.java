package day_6;

import java.util.Scanner;

public class Throw_Ex {

	public static void main(String[] args){
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Age :");
		int age = sc.nextInt();
		
		try {
			if(age<18) {
				throw new  IllegalArgumentException("You are not Eligible for voting!!!");
			}else {
				System.out.println("You are Eligible for voting...");
			} 
		}
		catch(IllegalArgumentException e) {
			System.out.println("Exception!");
			System.out.println(e);
		}
			finally {
				System.out.println("Program Ends ");
			}
		sc.close();
	}

}
