package controller;

import entities.*;

import java.util.ArrayList;

public class StockHandler {
    private ArrayList<StockItem> items = new ArrayList<>();

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
        return  "Stock {" +
                "stockItems=" + items +
                "} \n" +
                "There are: "+ treeCount + " trees in stock \n" +
                "There are: "+ flowerCount + " flowers in stock \n" +
                "There are: "+ decorCount + " decors in stock \n" +
                "Total value of Stock: "+ totalValue();
    }

    public void buyItem(StockItem item) {
        items.add(item);
        System.out.println("Añadido correctamente");
    }

    public boolean sellTree() {
        long count = items.stream()
                .filter(o -> o instanceof Tree)
                .count();
        if (count > 0) {
            items.removeIf(o -> o instanceof Tree);
            return true;
        }
        return false;
    }

    public boolean sellFlower() {
        long count = items.stream()
                .filter(o -> o instanceof Flower)
                .count();
        if (count > 0) {
            items.removeIf(o -> o instanceof Flower);
            return true;
        }
        return false;
    }

    public boolean sellDecor() {
        long count = items.stream()
                .filter(o -> o instanceof Decor)
                .count();
        if (count > 0) {
            items.removeIf(o -> o instanceof Decor);
            return true;
        }
        return false;
    }

    public float totalValue(){
        return items.stream().map(StockItem::getPrice).reduce(0.0f, Float::sum);
    }

}
