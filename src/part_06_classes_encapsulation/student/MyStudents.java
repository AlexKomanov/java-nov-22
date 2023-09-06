package part_06_classes_encapsulation.student;

import java.util.ArrayList;

public class MyStudents {
    public static void main(String[] args) {

        int[] grades = {50, 60, 70};

        Student alex = new Student("Alex", -5, grades);
        Student shaun = new Student("Shaun", -5, grades);

//        System.out.println(alex.getAge());
//
//        alex.setAge(-4);
//        System.out.println(alex.getAge());
//
////        alex.name = null;
//
//        alex.setName("Alexander");
//        System.out.println(alex.getName());
//
//
//        System.out.println(alex.getClass().getName() + "@" + Integer.toHexString(alex.hashCode()));
//        System.out.println();
//        System.out.println(alex);

        ArrayList<Student> students = new ArrayList<>();
        students.add(alex);
        students.add(shaun);

        students.forEach(student -> System.out.println(student));

    }
}
