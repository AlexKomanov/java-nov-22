package part_04_logical.conditions.classTasks;

import java.util.Scanner;

public class IfElseTask {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a number: ");
        int number = scanner.nextInt();

        if (number % 2 == 0) {
            System.out.println("number " + number + " is even.");
        } else {
            System.out.println("number " + number + " is odd.");
        }
    }
}
