package part_01_variables.homeTasks;

import java.util.Scanner;

public class ScannerHomeTask {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("What is your name? ");
        String myName = scanner.nextLine();

        System.out.println("What is your last name? ");
        String myLastName = scanner.nextLine();

        System.out.println("Where are you from? ");
        String myCity = scanner.nextLine();

        System.out.println("What is your average grade? ");
        double myAverageGrade = scanner.nextDouble();

        System.out.println("What is your age? ");
        int myAge = scanner.nextInt();

        System.out.println("myName = " + myName);
        System.out.println("myLastName = " + myLastName);
        System.out.println("myCity = " + myCity);
        System.out.println("myAverageGrade = " + myAverageGrade);
        System.out.println("myAge = " + myAge);
    }
}
