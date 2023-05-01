package ConditionalStatementsAdvanced_Exercise;

import java.util.Scanner;

public class Journey_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();


        double price = 0;

        switch (season){
            case "summer":
                if (budget<=100){
                    price = budget * 0.30;
                    System.out.printf("Somewhere in Bulgaria%nCamp - %.2f", price);
                } else if (budget<=1000) {
                    price = budget * 0.40;
                    System.out.printf("Somewhere in Balkans%nCamp - %.2f", price);
                } else {
                    price = budget * 0.90;
                    System.out.printf("Somewhere in Europe%nHotel - %.2f", price);
                } break;
            case "winter":
                if (budget<=100){
                    price = budget * 0.70;
                    System.out.printf("Somewhere in Bulgaria%nHotel - %.2f", price);
                } else if (budget<=1000) {
                    price = budget * 0.80;
                    System.out.printf("Somewhere in Balkans%nHotel - %.2f", price);
                } else {
                    price = budget * 0.90;
                    System.out.printf("Somewhere in Europe%nHotel - %.2f", price);
                }

        }

        }
    }




