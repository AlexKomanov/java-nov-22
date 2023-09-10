package part_07_final_exercises;

import java.util.Date;
import java.util.Random;

public class RandomNumber {
    public static void main(String[] args) {

        Random random = new Random();

        System.out.println("random.nextInt(100000) = " + random.nextInt(100000));

        int result  = (int) (Math.random() * 100000);
        System.out.println("Math.random() = " + result);

        Date date = new Date();
        System.out.println("date.getDate() = " + date.getTime());

    }
}
