package part_07_final_exercises;

import java.util.Random;
import java.util.Scanner;

public class FinalQuestion9 {
    public static void main(String[] args) {

        int sum = 0;
        int[] intArray = new int[5];
        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < intArray.length; i++) {
            System.out.println("enter " + (i+1) + " number: ");
            intArray[i] = scan.nextInt();
            sum = sum + intArray[i];
        }
        System.out.println("the sum of all numbers is: "+sum);



    }
}
