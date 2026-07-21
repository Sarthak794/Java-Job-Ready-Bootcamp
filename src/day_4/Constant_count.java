package day_4;
import java.util.Scanner;

public class Constant_count {

	Scanner sc = new Scanner(System.in);
	
	void Count() {
		System.out.println("Enter String:");
		String str  = sc.nextLine();
		int count=0;
		
		for(int i=0;i<=str.length()-1;i++) {
			char ch = str.charAt(i);
			
			if(ch !='a' && ch !='e' && ch !='i' && ch !='o' && ch !='u') {
				count++;
			}
		}
		System.out.println("Total Constants inString are: "+count);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Constant_count p = new Constant_count();
		p.Count();

	}

}
