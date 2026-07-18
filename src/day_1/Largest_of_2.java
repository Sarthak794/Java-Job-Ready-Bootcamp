package day_1;
import java.util.Scanner;
public class Largest_of_2 {
	public void Display() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two numbers:");
		int a= sc.nextInt();
		int b =sc.nextInt();
		if(a>b) {
			System.out.println(a+" is greater than "+b);
		}
		else {
			System.out.println(b+" is greater than "+a);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Largest_of_2 p = new Largest_of_2();
		p.Display();
	}

}
