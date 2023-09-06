package part_06_classes_encapsulation.student;

import java.util.Arrays;

public class Student {

    private String name;
    private int age;
    private int[] grades;


    public Student(String name, int age, int[] grades) {
        this.name = name;
        this.age = (age > 18) ? age : 18;
        this.grades = grades;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = (age > 18) ? age : 18;
    }

    public int[] getGrades() {
        return grades;
    }

    public void setGrades(int[] grades) {
        this.grades = grades;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", grades=" + Arrays.toString(grades) +
                '}';
    }
}
