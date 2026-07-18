package day_1;
import java.util.Scanner;

public class Tables {
	public void Display() {
		int a;
		System.out.println("Enter the number whose table you want:");
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		for(int i=1;i<=10;i++) {
			int c = a*i;
			System.out.println(a+" * "+i+" = "+c);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tables dp = new Tables();
		dp.Display();

	}

}
