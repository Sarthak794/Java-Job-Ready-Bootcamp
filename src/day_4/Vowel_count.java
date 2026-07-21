package day_4;
import java.util.Scanner;

public class Vowel_count {
	
	public void Count() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String: ");
		String str = sc.nextLine().toLowerCase();
		int count=0;
		
		for(int i=0; i<=str.length()-1;i++) {
			char ch = str.charAt(i);
			
			if(ch=='a'|| ch == 'e' || ch == 'i' || ch == 'o' || ch =='u') {
				count++;
			}
			
		}
		System.out.println("Total number of vovels in String are : "+count);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vowel_count p = new Vowel_count();
		p.Count();

	}

}
