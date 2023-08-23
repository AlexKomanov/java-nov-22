package part_04_logical.logicalOperators.classTasks;

public class LogicalClassTask {
    public static void main(String[] args) {
        System.out.println((0 > 5 && 6 > 5) || 7 == 7);  //(false) || true  --> true
        System.out.println (0 > 5 && (6 > 5 || 7 == 7)); // false && (true) --> false
        System.out.println(0 > 5 && 6 > 5 || 7 == 7);  // false || true --> true
        System.out .println(0 > 5 || 6 > 5 && 7 == 7) ;  // false || true --> true
        System.out .println(2 < 5 == true && 10 >= 10) ; // true && true --> true
    }
}
