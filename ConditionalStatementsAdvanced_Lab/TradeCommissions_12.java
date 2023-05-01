package ConditionalStatementsAdvanced_Lab;

import java.util.Scanner;

public class TradeCommissions_12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String town = scanner.nextLine();
        double volumeSales = Double.parseDouble(scanner.nextLine());
        double sum = 0;
        if (town.equals("Sofia")){
            if (0<=volumeSales && volumeSales<=500) {
                sum = volumeSales * 0.05;
                System.out.printf("%.2f", sum);
            } else if (500<volumeSales && volumeSales<=1000) {
                sum = volumeSales * 0.07;
                System.out.printf("%.2f", sum);
            } else if (1000<volumeSales && volumeSales<=10000 ) {
                sum = volumeSales * 0.08;
                System.out.printf("%.2f", sum);
            } else if (volumeSales>10000){
                sum = volumeSales * 0.12;
                System.out.printf("%.2f", sum);
            } else {
                System.out.println("error");
            }
        } else if (town.equals("Varna")){
            if (0<=volumeSales && volumeSales<=500){
                sum = volumeSales * 0.045;
                System.out.printf("%.2f", sum);
            } else if (500<volumeSales && volumeSales<=1000) {
                sum = volumeSales * 0.075;
                System.out.printf("%.2f", sum);
            } else if (1000<volumeSales && volumeSales<=10000) {
                sum = volumeSales * 0.10;
                System.out.printf("%.2f", sum);
            } else if (volumeSales>10000) {
                sum = volumeSales * 0.13;
                System.out.printf("%.2f", sum);
            } else {
                System.out.println("error");
            }
        } else if (town.equals("Plovdiv")) {
            if (0<=volumeSales && volumeSales<=500){
                sum = volumeSales * 0.055;
                System.out.printf("%.2f", sum);
            } else if (500<volumeSales && volumeSales <= 1000) {
                sum = volumeSales * 0.08;
                System.out.printf("%.2f", sum);
            } else if (1000 < volumeSales && volumeSales<=10000) {
                sum = volumeSales * 0.12;
                System.out.printf("%.2f", sum);
            } else if (volumeSales>10000) {
                sum = volumeSales * 0.145;
                System.out.printf("%.2f", sum);
            } else {
                System.out.println("error");
            }

        } else {
            System.out.println("error");
        }
    }
}
