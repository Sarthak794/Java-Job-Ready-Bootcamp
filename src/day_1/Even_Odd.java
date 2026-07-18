package day_1;
import java.util.Scanner;
public class Even_Odd {
	
	int a;
	void Check() {
		System.out.println("Enter the number:");
		Scanner sc=new Scanner(System.in);
		a = sc.nextInt();
		if(a%2==0) {
			System.out.println("Number is an Even Number...");
		}else {
			System.out.println("Number is Odd Number...");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Even_Odd p = new Even_Odd();
		p.Check();

	}

}
