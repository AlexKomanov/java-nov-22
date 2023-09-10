package part_07_final_exercises;

import java.util.Scanner;

public class FinalQuestion4 {
    public static void main(String[] args) {

        double temperatureCelcius, temperatureFahrenheit;
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a temperature in Celsius: ");
        temperatureCelcius = scan.nextInt();

        temperatureFahrenheit = (temperatureCelcius * (9 / 5)) + 32;
        System.out.println("A temperature in Fahrenheit it is " + temperatureFahrenheit);

    }
}
