package day_4;

import java.util.Scanner;

public class Remove_Duplicate_Characters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String :");
		String str = sc.nextLine();
		String processed ="";
		
		for(int i=0;i<str.length();i++) {
			char ch = str.charAt(i);
			
			if(processed.indexOf(ch)!=-1) {
				continue;
			}
			processed += ch; 
			
		}
		System.out.println("After removing Duplicates : "+processed);

	}

}
