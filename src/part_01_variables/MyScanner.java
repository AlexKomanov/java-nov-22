package part_01_variables;

import java.util.Scanner;

public class MyScanner {
    public static void main(String[] args) {

        Scanner moshe = new Scanner(System.in);
        System.out.println("Please enter your full name: ");
        String fullName = moshe.nextLine();
        System.out.println("Please enter your age: ");
        int age = moshe.nextInt();

        System.out.println("age = " + age);
        System.out.println("fullName = " + fullName);

    }
}
