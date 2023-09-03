package part_04_logical.conditions;

public class ConditionsSwitchCase {
    public static void main(String[] args) {

        int numberOfMonth = 1;

        switch (numberOfMonth) {
            case 1:
                System.out.println("January");
                break;
            case 2:
                System.out.println("February");
                break;
            case 3:
                System.out.println("March");
                break;
            case 4:
                System.out.println("April");
                break;
            case 5:
                System.out.println("May");
                break;
            default:
                System.out.println("Incorrect number of month it should be in range of 1-12");
        }
    }
}
