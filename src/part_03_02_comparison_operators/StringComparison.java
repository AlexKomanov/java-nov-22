package part_03_02_comparison_operators;

public class StringComparison {
    public static void main(String[] args) {

        String a = "Alex";
        String b = "Alex";
        String c = new String("Alex");
        String d = "aLeX";

        System.out.println(System.identityHashCode(a));
        System.out.println(System.identityHashCode(b));
        System.out.println(System.identityHashCode(c));


        System.out.println(a == b);
        System.out.println(a == c);
        System.out.println();
        System.out.println(a.equals(b));
        System.out.println(a.equals(c));
        System.out.println(d.equals(c));
        System.out.println(d.equalsIgnoreCase(c));
    }
}
