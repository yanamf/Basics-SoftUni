package ConditionalStatementsAdvanced_Exercise;

import java.util.Scanner;

public class SkiTrip_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int day = Integer.parseInt(scanner.nextLine());
        String type = scanner.nextLine();
        String rating = scanner.nextLine();
        double price = 0;

        switch (type){
            case "room for one person":
                price = --day * 18.00;
                break;
            case "apartment":
                price = --day * 25.00;
                if (day<10){
                    price = price * 0.70;
                } else if (day<=15) {
                    price = price * 0.65;
                } else  {
                    price = price * 0.50;
                }
                break;
            case "president apartment":
                price = --day * 35.00;
                if (day<10){
                    price = price * 0.90;
                } else if (day <=15) {
                    price = price * 0.85;
                } else {
                    price = price * 0.80;
                }
                break;

                }
                if (rating.equals("positive")){
                    price = price * 1.25;
                } else if (rating.equals("negative")) {
                    price = price * 0.90;
                }
        System.out.printf("%.2f", price);
    }
    }
