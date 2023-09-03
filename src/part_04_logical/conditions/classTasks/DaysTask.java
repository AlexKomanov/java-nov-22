package part_04_logical.conditions.classTasks;

import java.util.Scanner;

public class DaysTask {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter a number of day in range of 1-7: ");
        int numberOfDay = input.nextInt();

        switch (numberOfDay) {
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            case 7:
                System.out.println("Shabat");
                break;
            default:
                System.out.println("Incorrect number of day it should be in range of 1-7");
        }
    }
}
