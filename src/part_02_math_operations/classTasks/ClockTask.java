package part_02_math_operations.classTasks;

import java.util.Scanner;

public class ClockTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What time is it now? ");

        int wholeTime = scanner.nextInt();

        System.out.println("The current time is: ");
        System.out.println((wholeTime / 100) + " : " + (wholeTime % 100));

        int hours = wholeTime / 100;
        int minutes = wholeTime % 100;

        System.out.println("The current time is: ");
        System.out.println(hours + " : " + minutes);
    }
}
