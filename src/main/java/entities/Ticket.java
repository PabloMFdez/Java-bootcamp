package entities;

import java.util.ArrayList;

public class Ticket {
    ArrayList<StockItem> items = new ArrayList<>();

    public float totalValue() {
        return items.stream().map(StockItem::getPrice).reduce(0.0f, Float::sum);

    }

    public void addItem(StockItem item) {
        items.add(item);
    }


    @Override
    public String toString() {
        long treeCount = items.stream()
                .filter(o -> o instanceof Tree)
                .count();
        long flowerCount = items.stream()
                .filter(o -> o instanceof Flower)
                .count();
        long decorCount = items.stream()
                .filter(o -> o instanceof Decor)
                .count();
        return  "Sale: \n" +
                "Trees: "+ treeCount + " \n" +
                "Flowers: "+ flowerCount + " \n" +
                "Decors: "+ decorCount + " \n" +
                "Total cost: "+ totalValue();
    }

}
