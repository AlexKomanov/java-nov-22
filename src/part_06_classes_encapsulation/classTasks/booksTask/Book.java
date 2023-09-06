package part_06_classes_encapsulation.classTasks.booksTask;

public class Book {

    private String name;
    private double price;
    private int pagesAmount;

    public Book() {
    }

    public Book(String name, double price, int pagesAmount) {
        this.name = name;
        this.price = price;
        this.pagesAmount = pagesAmount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getPagesAmount() {
        return pagesAmount;
    }

    public void setPagesAmount(int pagesAmount) {
        this.pagesAmount = pagesAmount;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", pagesAmount=" + pagesAmount +
                '}';
    }
}
