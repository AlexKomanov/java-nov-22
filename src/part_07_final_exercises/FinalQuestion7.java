package part_07_final_exercises;

import java.util.Scanner;

public class FinalQuestion7 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int number, maximumNumber, minimumNumber;

        System.out.println("Please provide an integer ot provide 0 to terminate... ");

        number = input.nextInt();
        minimumNumber = number;
        maximumNumber = number;
        while (number != 0) {

            if (number > maximumNumber){
                maximumNumber = number;
            }

            if (minimumNumber < number) {
                minimumNumber = number;
            }
            System.out.println("Please provide an integer ot provide 0 to terminate... ");
            number = input.nextInt();
        }

        System.out.println("Maximum " + maximumNumber);
        System.out.println("Minimum " + minimumNumber);
    }
}
