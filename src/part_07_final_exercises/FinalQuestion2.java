package part_07_final_exercises;

import java.util.Calendar;
import java.util.Scanner;

public class FinalQuestion2 {
    public static void main(String[] args) {

        int year = Calendar.getInstance().get(Calendar.YEAR);
        Scanner scan = new Scanner(System.in);
        System.out.println("Hello, What is your age?: ");
        int age = scan.nextInt();
        int birthYear = year-age;
        System.out.println("That means you were born in "+birthYear);
        int futureAge = age+20;
        System.out.println("This means that in 20 years you will be "+futureAge+" years old!");


    }
}
