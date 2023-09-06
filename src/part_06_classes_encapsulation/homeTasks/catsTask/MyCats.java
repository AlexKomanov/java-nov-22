package part_06_classes_encapsulation.homeTasks.catsTask;

import java.util.ArrayList;

public class MyCats {

    public static void main(String[] args) {

        ArrayList<Cat> catsList = new ArrayList<>();

        catsList.add(new Cat("Cat1", "black", 5.6));
        catsList.add(new Cat("Cat2", "white", 7.6));
        catsList.add(new Cat("Cat3", "brown", 8.6));
        catsList.add(new Cat("Cat4", "grey", 9.6));
        catsList.add(new Cat("Cat5", "mixed", 2.6));

        printCatsInformation(catsList);
    }

    public static void printCatsInformation(ArrayList<Cat> list) {

//        for (Cat cat : list) {
//            System.out.println(cat);
//        }

        list.forEach(cat -> System.out.println(cat));
    }
}
