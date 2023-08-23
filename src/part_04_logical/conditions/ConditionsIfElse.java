package part_04_logical.conditions;

import java.util.Scanner;

public class ConditionsIfElse {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("What is your age? ");
        int age = input.nextInt();

        if (age > 18) {
            System.out.println("You are above than 18");
        } else if (age == 18) {
            System.out.println("You are 18");
        } else {
            System.out.println("You are under 18");
        }


    }
}
