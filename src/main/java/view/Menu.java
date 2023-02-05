package view;

public class Menu {
    public static void show() {
        System.out.println("**** FLOWER POWER ****");
        System.out.println("1· Buy");
        System.out.println("2· Sell");
        System.out.println("3· Check Stock");
        System.out.println("4· Generate Ticket");
        System.out.println("5· Sell history");
        System.out.println("0· Finish program.");
    }

    public static void buyMenu() {
        System.out.println("What do you want to buy:");
        System.out.println("1· Buy Tree");
        System.out.println("2· Buy Flower");
        System.out.println("3· Buy Decor");
    }

    public static void sellMenu() {
        System.out.println("What do you want to sell:");
        System.out.println("1· Sell Tree");
        System.out.println("2· Sell Flower");
        System.out.println("3· Sell Decor");
    }
}
