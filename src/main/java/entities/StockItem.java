package entities;

public class StockItem {
    protected String name;
    protected Float price;

    public StockItem(String name, Float price) {
        this.name = name;
        this.price = price;
    }

    public Float getPrice() {
        return price;
    }
}
