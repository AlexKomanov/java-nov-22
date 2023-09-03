package part_06_classes_encapsulation.car;

public class MyCars {
    public static void main(String[] args) {
        Car.printStaticCounter();
        Car bmw = new Car("BMW", 2022, 350.5, false);
//        System.out.println(bmw.brand);
//        bmw.brand = "BMW";
//        bmw.year = 2023;
//        bmw.isElectrical = true;
//        bmw.horsePower = 250.5;
        System.out.println(bmw.getBrand());
        System.out.println(bmw.year);
        System.out.println(bmw.isElectrical);
        System.out.println(bmw.horsePower);

//        bmw.printCounter();
//        Car.printStaticCounter();
        Car tesla = new Car();
        tesla.year = 2023;

        System.out.println(tesla.getBrand());
        System.out.println(tesla.year);
        System.out.println(tesla.isElectrical);

//        tesla.printCounter();
//        Car.printStaticCounter();

        Car skoda = new Car("Skoda", 2019);
//        skoda.printCounter();
//        Car.printStaticCounter();
        System.out.println("skoda.year = " + skoda.year);
//        skoda.year = -23;
        System.out.println("skoda.year = " + skoda.year);
        skoda.setBrand("Skoda Kamiq");
        System.out.println("skoda.brand = " + skoda.getBrand());
    }
}
