package WhileLoopExercise;

import java.util.Scanner;

public class Series_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int countShows = Integer.parseInt(scanner.nextLine());
        double sum = 0;

        for (int i = 1; i <= countShows; i++) {
            String name = scanner.nextLine();
            double priceShow = Double.parseDouble(scanner.nextLine());

            switch (name) {
                case "Thrones":
                    sum += priceShow * 0.50;
                    break;
                case "Lucifer":
                    sum += priceShow * 0.60;
                    break;
                case "Protector":
                    sum += priceShow * 0.70;
                    break;
                case "TotalDrama":
                    sum += priceShow * 0.80;
                    break;
                case "Area":
                    sum += priceShow * 0.90;
                    break;
                default:
                    sum += priceShow;
            }
        }
        if (budget>=sum) {
            System.out.printf("You bought all the series and left with %.2f lv.", budget-sum);
        }
        if (budget<sum){
            System.out.printf("You need %.2f lv. more to buy the series!", Math.abs(sum-budget));
        }
    }
}
