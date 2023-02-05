package entities;

public class Tree extends StockItem {
    private final float height;

    public Tree(String name, float height, float price) {
        super(name, price);
        this.height = height;
    }

    @Override
    public String toString() {
        return "Tree{" +
                "name='" + name + '\'' +
                ", height=" + height +
                ", price=" + price +
                '}';
    }
}
