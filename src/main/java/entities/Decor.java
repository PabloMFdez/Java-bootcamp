package entities;

public class Decor extends StockItem {
    public Decor(String name, Float price) {
        super(name, price);
    }
    @Override
    public String toString() {
        return "Decor{" +
                "material='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
