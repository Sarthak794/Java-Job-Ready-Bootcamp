package day_4;

import java.util.Scanner;

public class Character_Frequency {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String :");
		String str = sc.nextLine();
		String proc = " ";
		
		for(int i=0;i<str.length();i++) {
			char ch = str.charAt(i);
			
			if(proc.indexOf(ch)!= -1) {
				continue;
			}
			int count =0;
			
			for(int j=0;j<str.length();j++) {
				
				if(ch==str.charAt(j)) {
					count++;
				}
			}
			System.out.println(ch+" "+count);
			proc = proc+ch;
		}
		

	}

}
