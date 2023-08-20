package part_03_01_assignment_operators;

public class IncrementDecrement {
    public static void main(String[] args) {

        int a = 10;
        System.out.println("a = " + a);

        System.out.println("a++ -> " + (a++)); // Postfix
        System.out.println("a = " + a);
        System.out.println("++a -> " + (++a)); //Prefix
        System.out.println("a = " + a);
        a = a + 1;
        System.out.println("a = " + a);

        a += 1;
        System.out.println("a = " + a);

        a++; //Increment
        System.out.println("a = " + a);

        a = 10;
        System.out.println("a = " + a);

        a = a - 1;
        System.out.println("a = " + a);

        a -= 1;
        System.out.println("a = " + a);

        a--; // Decrement
        System.out.println("a = " + a);
    }
}
