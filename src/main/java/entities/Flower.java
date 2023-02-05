package entities;

public class Flower extends StockItem {
    private final String color;

    public Flower(String name, String color, Float price) {
        super(name, price);
        this.color = color;
    }

    @Override
    public String toString() {
        return "Flower{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                '}';
    }
}
