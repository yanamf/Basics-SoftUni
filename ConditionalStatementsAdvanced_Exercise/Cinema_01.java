package ConditionalStatementsAdvanced_Exercise;

import java.util.Scanner;

public class Cinema_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String typeProjection = scanner.nextLine();
        int rowQuantity = Integer.parseInt(scanner.nextLine());
        int columnQuantity = Integer.parseInt(scanner.nextLine());
        double income = 0.0;

        if (typeProjection.equals("Premiere")){
            income = rowQuantity * columnQuantity * 12;

        } else if (typeProjection.equals("Normal")) {
            income = rowQuantity * columnQuantity * 7.50;

        } else if (typeProjection.equals("Discount")) {
            income = rowQuantity * columnQuantity * 5;
        }
        System.out.printf("%.2f", income);
    }
}
