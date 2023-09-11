package part_07_final_exercises;

import java.util.ArrayList;
import java.util.Scanner;

public class FinalQuestion10 {
    public static void main(String[] args) {

        int sum = 0;
        ArrayList<Integer> arrayList = new ArrayList<>();
        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            System.out.println("Enter " + (i+1) + " number: ");
            arrayList.add(scan.nextInt());
            sum += arrayList.get(i);
        }
        System.out.println("the average is: " + sum / arrayList.size());



    }
}
