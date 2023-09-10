package part_07_final_exercises;

import java.util.Scanner;

public class FinalQuestion5 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int start, end, div, div2;
        System.out.println("Enter the start number: ");
        start = scan.nextInt();
        System.out.println("Enter the end number: ");
        end = scan.nextInt();
        System.out.println("Enter the first divide number: ");
        div = scan.nextInt();
        System.out.println("Enter the second divide number: ");
        div2 = scan.nextInt();

        for (int i = start; i <= end; i++) {
            if (i % div == 0 && i % div2 == 0) {
                System.out.println(i);
            }

        }


    }
}
