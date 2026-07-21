package day_4;
import java.util.Scanner;

public class Count_Digit {
	public void Count() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string :");
		String str  = sc.nextLine();
		int count=0;
		
		for(int i=0; i<=str.length()-1;i++) {
			char ch = str.charAt(i);
			if(ch >='0' && ch <='9') {
				count++;
			}
		}
		System.out.println(count);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Count_Digit p = new Count_Digit();
		p.Count();
	}

}
