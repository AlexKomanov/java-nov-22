package part_04_logical.conditions;

public class ConditionsTernary {
    public static void main(String[] args) {

        int age = 18;

        String messageToUser = (age > 18) ? "You are above than 18"
                               : (age == 18) ? "You are 18"
                               : "You are under 18";
        System.out.println("messageToUser = " + messageToUser);

    }
}
