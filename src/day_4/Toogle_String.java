package day_4;

import java.util.Scanner;

public class Toogle_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String :");
		String str = sc.nextLine();
		String toggleRes = "";

		for (int i=0;i<str.length();i++) {

		    char ch = str.charAt(i);

		    if (Character.isUpperCase(ch)) {
		    	ch=Character.toLowerCase(ch);
		    	toggleRes += ch;
		    }
		    else if (Character.isLowerCase(ch)) {
		       ch= Character.toUpperCase(ch);
		        toggleRes  += ch;
		    }
		    toggleRes += ch;
		}
		System.out.println(toggleRes);
	}

}
