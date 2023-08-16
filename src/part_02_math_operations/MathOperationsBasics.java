package part_02_math_operations;

public class MathOperationsBasics {
    public static void main(String[] args) {

        System.out.println(2 + 5);
        System.out.println(2 - 5);
        System.out.println(10 - 5);
        System.out.println(2 * 5);


        System.out.println(19 / 3);
        System.out.println(19 / 3.0);
        System.out.println(19.0 / 3);
//        System.out.println(5 / 0); // Exception in thread "main" java.lang.ArithmeticException: / by zero
        System.out.println(5.0 / 0.0); // Infinity

        System.out.println("20 / 3 = " + (20 / 3)); // 20 / 3 --> 18 / 3 = 6
        System.out.println("20 % 3 = " + (20 % 3));

        System.out.println("21 / 3 = " + (21 / 3)); // 21 / 3 --> 21 / 3 = 7
        System.out.println("21 % 3 = " + (21 % 3));

        System.out.println(20 % 2);
        System.out.println(21 % 2);

        System.out.println (1456 % 10);   // 6
        System.out.println (1456 % 100);  // 56

        System.out.println (1456 / 10);  // 145
        System.out.println (1456 / 100); // 14

        System.out.println(Math.pow(5.5, 2));


    }
}
