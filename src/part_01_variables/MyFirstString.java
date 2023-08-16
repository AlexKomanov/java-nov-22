package part_01_variables;


import java.util.Scanner;

public class MyFirstString {
    public static void main(String[] args) {

        int myAge;   // 4 bytes |_|_|_|_|

        String myString;   // 0 bytes

//       String myName = new String("856985");
//        System.out.println("myName = " + myName);


        String name = "Alex";

        System.out.println("name = " + name);


        Scanner input = new Scanner(System.in);
        String myName = input.nextLine();

        System.out.println("myName = " + myName);

        int hours = 23;
        int minutes = 59;

        System.out.println(hours + " : " + minutes);
    }
}
