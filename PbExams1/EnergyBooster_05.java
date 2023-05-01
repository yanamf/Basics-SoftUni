package PbExams1;

import java.util.Scanner;

public class EnergyBooster_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String type = scanner.nextLine();
        String size = scanner.nextLine();
        int quantity = Integer.parseInt(scanner.nextLine());

        double price = 0;

        switch (type) {
            case "Watermelon":
                if (size.equals("small")) {
                    price = 2 * 56 * quantity;
                }
                if (size.equals("big")) {
                    price = 5 * 28.70 * quantity;
                }
                break;
            case "Mango":
                if (size.equals("small")) {
                    price = 2 * 36.66 * quantity;
                }
                if (size.equals("big")) {
                    price = 5 * 19.60 * quantity;
                }
                break;
            case "Pineapple":
                if (size.equals("small")) {
                    price = 2 * 42.10 * quantity;
                }
                if (size.equals("big")) {
                    price = 5 * 24.80 * quantity;
                }
                break;
            case "Raspberry":
                if (size.equals("small")) {
                    price = 2 * 20 * quantity;
                }
                if (size.equals("big")) {
                    price = 5 * 15.20 * quantity;
                }
                break;
        }
        if (price >= 400 && price <= 1000) {
            price = price * 0.85;
        }
        if (price>1000){
            price = price * 0.5;
        }
        System.out.printf("%.2f lv.", price);
    }
}
