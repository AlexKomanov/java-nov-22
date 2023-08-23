package part_03_02_comparison_operators.homeTasks;

import java.util.Scanner;

public class CheckNumbersWithScanner {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = input.nextInt();
        System.out.println(number %2 == 0);
        System.out.println("A number " + number + " is even? -> " + (number % 2 == 0));




    }
}
