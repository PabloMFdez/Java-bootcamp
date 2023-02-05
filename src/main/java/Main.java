import Utils.Utils;
import model.Model;
import controller.FlowerShop;
import view.*;

public class Main {
    static FlowerShop flowerShop;
    public static void main(String[] args) {
        flowerShop = new FlowerShop();
        Utils.createFile();
        int input;
        do {
            Menu.show();
            input = Utils.askInt();
            switch (input) {
                case 1:
                    buyMenu();
                    break;
                case 2:
                    sellMenu();
                    break;
                case 3:
                    flowerShop.stockInfo();
                    break;
                case 4:
                    flowerShop.generateTicket();
                    break;
                case 0:
                    Model.writeStock(flowerShop.stockInfo());
                    Model.writeSales(flowerShop.salesInfo());
                    break;
                default:
                    System.out.println("Choose valid option.");
                    break;
            }
        } while (input != 0);
    }

    private static void buyMenu(){
        int input;
        do {
            Menu.buyMenu();
            input = Utils.askInt();
            switch (input) {
                case 1:
                case 2:
                case 3:
                    flowerShop.buyItem(input);
                    break;
                default:
                    System.out.println("Choose valid option.");
                    break;
            }
        } while (input != 0);
    }

    private static void sellMenu(){
        int input;
        do {
            Menu.sellMenu();
            input = Utils.askInt();
            switch (input) {
                case 1:
                case 2:
                case 3:
                    flowerShop.sellItem(input);
                    break;
                default:
                    System.out.println("Choose valid option.");
                    break;
            }
        } while (input != 0);
    }

}