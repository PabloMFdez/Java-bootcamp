package controller;

import entities.*;

public class FlowerShop {
    StockHandler stockHandler = new StockHandler();
    TicketHandler ticketHandler = new TicketHandler();

    public void buyItem(Integer item) {
        switch (item) {
            case 1:
                stockHandler.buyItem(new Tree("Oak", 25, 200));
                break;
            case 2:
                stockHandler.buyItem(new Flower("Rose", "Red", 5F));
                break;
            case 3:
                stockHandler.buyItem(new Decor("Wood", 40F));
                break;
        }
    }

    public void sellItem(Integer item) {
        switch (item) {
            case 1:
                if (stockHandler.sellTree()) {
                    ticketHandler.addItemToTicket(new Tree("Oak", 25, 200));
                }else {
                    System.out.println("Sorry we don't have this product on stock");
                }
                break;
            case 2:
                if (stockHandler.sellFlower()) {
                    ticketHandler.addItemToTicket(new Flower("Rose", "Red", 5F));
                }else {
                    System.out.println("Sorry we don't have this product on stock");
                }
                break;
            case 3:
                if (stockHandler.sellDecor()) {
                    ticketHandler.addItemToTicket(new Decor("Wood", 40F));
                }else {
                    System.out.println("Sorry we don't have this product on stock");
                }
                break;
        }
    }

    public void generateTicket() {
        ticketHandler.storeTicket();
    }

    public String stockInfo() { return stockHandler.toString(); }
    public String salesInfo() { return ticketHandler.toString(); }

}
