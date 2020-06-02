package Lesson_05.Ex_02;

public class Products {
    private String productName;
    private long articul;
    private double price;

    public Products(String productName, long articul, double price) {
        this.productName = productName;
        this.articul = articul;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }
}
