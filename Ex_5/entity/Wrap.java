
package Lesson_05.Ex_05.entity;

public class Wrap {
    private WrapType wrapType;
    private double price;

    public Wrap(WrapType wrapType) {
        price = wrapType.getPrice();
        this.wrapType = wrapType;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return wrapType.getName();
    }
}