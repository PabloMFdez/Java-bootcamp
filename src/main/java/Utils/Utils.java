package Utils;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Utils {
    public static int askInt() {
        int input = -1;
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            input = sc.nextInt();
        } else {
            System.out.println("Debe escoger una opción del menú.\n");
        }
        return input;
    }

    public static void createFile() {
        File file = new File("Floristeria.txt");

        if(file.exists()){
            System.out.println("El archivo ya existe");
            return;
        }
        try {
            FileWriter escritor = new FileWriter(file);
            escritor.write("***FLORISTERIA***\n");
            escritor.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void writeToFile(String st) {
        try {
            FileWriter fw = new FileWriter("Floristeria.txt", true);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(st);
            bw.newLine();
            bw.close();
        } catch (IOException e) {
            System.out.println("Se ha producido un error.");
        }
    }

}
