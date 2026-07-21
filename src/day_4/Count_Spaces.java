package day_4;
import java.util.Scanner;

public class Count_Spaces {
	public void Count() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your String :");
		String str  = sc.nextLine();
		int count=0;
		
		for(int i=0;i<=str.length()-1;i++) {
			char ch = str.charAt(i);
			
			if(ch ==' ') {
				count++;
			}
		}
		System.out.println("Total Spaces ="+count);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Count_Spaces p = new Count_Spaces();
		p.Count();

	}

}
