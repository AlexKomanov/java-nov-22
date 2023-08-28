package part_05_arrays_loops.arrays;

public class ArraysExamples {
    public static void main(String[] args) {
        //                 0        1       2
        String names[] ={"Alex","Nitzan","Moshe"};

        System.out.println("names lengh is: "+ names.length);

        System.out.println("Before Change " +names[1]);
        names[1]="Idan";
        System.out.println("After Change "+names[1]);

        System.out.println("What will happen "+names[-1]);


    }
}
