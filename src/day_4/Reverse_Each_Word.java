package day_4;

import java.util.Scanner;

public class Reverse_Each_Word {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the String:");
        String str = sc.nextLine();

        String rev = "";
        String[] words = str.split(" ");

        for (String word : words) {

            for (int j = word.length() - 1; j >= 0; j--) {
                rev += word.charAt(j);
            }

            rev += " ";
        }

        System.out.println("Reversed Each Word: " + rev);

        sc.close();
    }
}