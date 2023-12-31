package part_05_arrays_loops;

public class Scope {
    public static void main(String[] args) {

           //                    0    1   2   3   4
        int[]  arrayOfNumbers = {10, 20, 30, 40, 50};

        int globalSum = 0;

        for (int i = 0; i < arrayOfNumbers.length; i++) {
            globalSum += arrayOfNumbers[i];
            int lastValue = arrayOfNumbers[i];
            System.out.println("lastValue = " + lastValue);
        }

        System.out.println("globalSum = " + globalSum);

        System.out.println(calculateSumOfTwoNumbers(5, 10));
        System.out.println(calculateSumOfTwoNumbers(1, 100));
        System.out.println(calculateSumOfTwoNumbers(150, 200));
        System.out.println(calculateSumOfTwoNumbers(1, 0));
        System.out.println(calculateSumOfTwoNumbers(1000, 10));
        printSummary(20, 30);

    }

    public static int calculateSumOfTwoNumbers(int a, int b) {
        int summary = a + b;
        System.out.println("Calculating a total summary of " + a + " and " + b + "...");
        return summary;
    }

    public static void printSummary(int a, int b) {
        int summary = a + b;
        System.out.println(summary);
    }
}
