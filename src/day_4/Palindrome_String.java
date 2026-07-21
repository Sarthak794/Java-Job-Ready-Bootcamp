package day_4;
import java.util.Scanner;
public class Palindrome_String {
	
	public void Check_Palindrome() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String to check: ");
		String str = sc.nextLine();
		String rev = "";
		
		for(int i=str.length() - 1;i>=0;i--) {
			rev += str.charAt(i);
		}
		if(str.equals(rev)) {
			System.out.println("String is Palindrome...");
		}else {
			System.out.println("String is not Palindrome!!!");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Palindrome_String p = new Palindrome_String();
		p.Check_Palindrome();

	}

}
