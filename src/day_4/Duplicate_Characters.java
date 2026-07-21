package day_4;

import java.util.Scanner;

public class Duplicate_Characters {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String : ");
		String str= sc.nextLine();
		String processed = " ";
		
		for(int i=0;i<str.length();i++) {
			char ch = str.charAt(i);
			
			if(processed.indexOf(ch) != -1) {
				continue;
			}
			int count =0;
			
			for(int j=0; j<str.length();j++) {
				if(ch== str.charAt(j)) {
					
					count ++;
				}
				
			}
			if(count>=2) {
				System.out.println(ch+" : "+count);
			}
			processed = processed+ch;
		}

	}

}
