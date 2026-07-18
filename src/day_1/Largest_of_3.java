package day_1;

import java.util.Scanner;

public class Largest_of_3 {
	int a, b, c;
	
	public void Check() {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter three numbers to compare :");
		a= sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		
		if(a>b && a>c) {
			System.out.println(a+" is greater than both other numbers ");
		}
		else if(b>a && b>c) {
			System.out.println(b+" is greater than other numbers...");
		}
		else{
			System.out.println(c+ " is greater than other numbers...");
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Largest_of_3 c= new Largest_of_3();
		c.Check();

	}

}
