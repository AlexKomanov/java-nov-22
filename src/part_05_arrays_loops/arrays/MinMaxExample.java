package part_05_arrays_loops.arrays;

import java.util.Scanner;

public class MinMaxExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get three numbers from the user
        System.out.print("Enter number 1: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter number 2: ");
        int num2 = scanner.nextInt();

        System.out.print("Enter number 3: ");
        int num3 = scanner.nextInt();

        scanner.close();

        // Insert numbers into an array
        int[] numbers = {num1, num2, num3};

        // Calculate minimum, maximum, and average using the numbers array
        int min = numbers[0];
        int max = numbers[0];
        int sum = numbers[0] + numbers[1] + numbers[2];

        if (numbers[1] < min) {
            min = numbers[1];
        }
        if (numbers[2] < min) {
            min = numbers[2];
        }

        if (numbers[1] > max) {
            max = numbers[1];
        }
        if (numbers[2] > max) {
            max = numbers[2];
        }

        double average = (double) sum / numbers.length;

        // Print the results
        System.out.println("Minimum number: " + min);
        System.out.println("Maximum number: " + max);
        System.out.println("Average: " + average);
    }
}