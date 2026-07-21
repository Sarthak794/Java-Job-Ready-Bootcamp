package day_4;

import java.util.Scanner;

public class Capitalize_Each_Word {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the String:");
        String str = sc.nextLine();

        String[] words = str.split(" ");
        String result = "";

        for (String word : words) {

            char first = Character.toUpperCase(word.charAt(0));
            String remaining = word.substring(1);

            result += first + remaining + " ";
        }

        System.out.println("Capitalized String: " + result);

        sc.close();
    }
}