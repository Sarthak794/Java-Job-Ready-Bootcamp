package day_1;
import java.util.Scanner;

public class Fibonacci {
	Scanner sc= new Scanner(System.in);
	
	public void Series() {
		int a;
		int first=1;
		int second=0;
		int nextterm=1;
		System.out.println("Enter the number you want the the must go on... :");
		a = sc.nextInt();
		for(int i=0;i<=a;i++) {
			System.out.print(nextterm+" ");
			
			nextterm= first+second;
			second = first;
			first= nextterm;
			
			
			
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fibonacci p = new Fibonacci();
		p.Series();
	}

}
