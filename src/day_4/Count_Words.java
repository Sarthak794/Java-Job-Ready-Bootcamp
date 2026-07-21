package day_4;

import java.util.Scanner;

public class Count_Words {

    public void Count() {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter String: ");
        String str = sc.nextLine().trim();

        if (str.isEmpty()) {
            System.out.println("Total Words = 0");
        } else {
            String[] words = str.split("\\s+");
            System.out.println("Total Words = " + words.length);
        }
    }

    public static void main(String[] args) {

        Count_Words p = new Count_Words();
        p.Count();
    }
}