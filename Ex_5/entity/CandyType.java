
package Lesson_05.Ex_05.entity;

public enum CandyType implements Type {
    CARAMEL("Caramel", 10),
    CHOCOLATE("Chocolate", 35),
    GUMMIES("Gummies", 15),
    LICORICE("Licorice", 20);
    private String name;
    private int price;

    CandyType(String name, int price) {
        this.name = name;
        this.price = price;
    }


    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public String getName() {
        return name;
    }
}