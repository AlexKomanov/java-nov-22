package part_07_final_exercises;

import java.util.Scanner;

public class FinalQuestion3 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a word: ");
        String word = scan.nextLine();

        System.out.println(word.length());

        for (int i = word.length() - 1; i >= 0; i--) {
            System.out.print(word.charAt(i));

        }

    }
}
