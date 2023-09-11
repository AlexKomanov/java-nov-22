package part_07_final_exercises;

import java.util.Random;
import java.util.Scanner;

public class FinalQuestion8 {
    public static void main(String[] args) {

        Random rand = new Random();
        int randomNum = rand.nextInt(99) + 1;
        System.out.println(" I chose a number between 1 and 99. You have seven attempts to try and guess it");
        Scanner scan = new Scanner(System.in);
        for (int i = 1; i < 8; i++) { //seven attempts to try and guess
            System.out.print("guess number " + i + " :   ");
            int userGuess = scan.nextInt();
            if (userGuess > randomNum) {
                System.out.println("Your guess is BIGGER than the chosen value");
            } else if (userGuess < randomNum) {
                System.out.println("Your guess is SMALLER than the chosen value");
            } else {
                System.out.println("Congratulations, you guessed it!");
                break; // stop the loop for good guess
            }
            if (i == 7) {
                //after 7 wrong guess - tell the number
                System.out.println("Sorry ): My number was " + randomNum);
            }
        }


    }
}
