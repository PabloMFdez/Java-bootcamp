package model;

import Utils.Utils;

public class Model {

    public static void writeStock(String stockInfo) {
        Utils.writeToFile("*************************************************");
        Utils.writeToFile("Stock:");
        Utils.writeToFile(stockInfo);
    }

    public static void writeSales(String sellsInfo) {
        Utils.writeToFile("*************************************************");
        Utils.writeToFile("Sales:");
        Utils.writeToFile(sellsInfo);
        Utils.writeToFile("*************************************************");
    }
}
