package day_1;
import java.util.Scanner;

public class Postive_Negative_Zero {
	int a;
	public void Check() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number to check it state:");
		a = sc.nextInt();
		if(a>0) {
			System.out.println("Number is Positive Number...");
		}
		else if(a==0){
			System.out.println("Number is Zero...");
		}
		else {
			System.out.println("Number is Negative Number...");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Postive_Negative_Zero p = new Postive_Negative_Zero();
		p.Check();

	}

}
