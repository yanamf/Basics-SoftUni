package ConditionalStatementsAdvanced_Exercise;

import java.util.Scanner;

public class Fishing_Boat_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int budget = Integer.parseInt(scanner.nextLine());
        String season = scanner.nextLine();
        int countFishers = Integer.parseInt(scanner.nextLine());
        double price = 0;


        switch (season) {
            case "Spring":
                price = 3000;
                if (countFishers <= 6) {
                    price = price - price * 0.10;

                } else if (countFishers <= 11) {
                    price = price - price * 0.15;

                } else {
                    price = price - price * 0.25;

                }
                if (countFishers % 2 == 0) {
                    price = price - price * 0.05;
                }
                break;
            case "Summer":
                price = 4200;
                if (countFishers <= 6) {
                    price = price - price * 0.10;

                } else if (countFishers <= 11) {
                    price = price - price * 0.15;

                } else {
                    price = price - price * 0.25;

                }
                if (countFishers % 2 == 0) {
                    price = price - price * 0.05;
                }
                break;
            case "Autumn":
                price = 4200;
                if (countFishers <= 6) {
                    price = price - price * 0.10;

                } else if (countFishers <= 11) {
                    price = price - price * 0.15;


                } else {
                    price = price - price * 0.25;

                }
                break;

            case "Winter":
                price = 2600;
                if (countFishers <= 6) {
                    price = price - price * 0.10;

                } else if (countFishers <= 11) {
                    price = price - price * 0.15;

                } else {
                    price = price - price * 0.25;

                }
                if (countFishers % 2 == 0) {
                    price = price - price * 0.05;
                }
                break;
        }


                if (budget>=price){
                    System.out.printf("Yes! You have %.2f leva left.", Math.abs(budget - price));

                } else  {
                System.out.printf("Not enough money! You need %.2f leva.", Math.abs(budget - price));

                }

        }
    }
