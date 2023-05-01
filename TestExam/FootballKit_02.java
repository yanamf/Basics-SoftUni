package TestExam;

import java.util.Scanner;

public class FootballKit_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double priceTShirt = Double.parseDouble(scanner.nextLine());
        double goalSum = Double.parseDouble(scanner.nextLine());

        double priceShorts = priceTShirt * 0.75;
        double priceSocks = priceShorts * 0.20;
        double priceShoes = (priceTShirt + priceShorts) * 2;

        double totalSum = priceTShirt + priceShorts + priceSocks + priceShoes;

        double sumDiscount = totalSum * 0.85;

        if (sumDiscount>=goalSum){
            System.out.printf("Yes, he will earn the world-cup replica ball!%nHis sum is %.2f lv.", sumDiscount);
        } else {
            System.out.printf("No, he will not earn the world-cup replica ball.%nHe needs %.2f lv. more.", goalSum-sumDiscount);
        }
        }
    }

