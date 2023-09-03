package part_06_classes_encapsulation.car;

public class Car {

    // Step 1: Create fields/variables

    private String brand;
    public int year;
    public  double horsePower;
    public boolean isElectrical;
    public String color;
    public int counter = 0;
    public static int staticCounter = 0;


    public Car() {
        this.counter++;
        staticCounter++;
    }

    public Car(String brand, int year, double horsePower, boolean isElectrical) {
        this.brand = brand;
        this.year = this.validateYear(year);
        this.horsePower = horsePower;
        this.isElectrical = isElectrical;
        this.counter++;
        staticCounter++;
    }

    public Car(String brand, int year) {
        this.brand = brand;
        this.year = this.validateYear(year);
        this.counter++;
        staticCounter++;
    }

    public void printCounter() {
        System.out.println("counter = " + counter);
    }

    public static void printStaticCounter() {
        System.out.println("staticCounter = " + staticCounter);
    }

    private int validateYear(int year) {
        return (year < 2010 || year > 2023) ? 2010 : year;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
}
