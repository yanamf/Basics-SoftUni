package TestExam;

import java.util.Scanner;

public class GrandpaStavri_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        double totalAlcoholQuantity = 0;
        double totalAlcoholDegrees = 0;


        for (int i = 1; i <= n; i++) {
            double currentAlcoholQuantity = Double.parseDouble(scanner.nextLine());
            double currentAlcoholDegrees = Double.parseDouble(scanner.nextLine());
            totalAlcoholQuantity += currentAlcoholQuantity;
            totalAlcoholDegrees = totalAlcoholDegrees + currentAlcoholDegrees * currentAlcoholQuantity;

        }
        double averageSumDegrees = totalAlcoholDegrees / totalAlcoholQuantity;


        System.out.printf("Liter: %.2f%n", totalAlcoholQuantity);
        System.out.printf("Degrees: %.2f%n", averageSumDegrees);
        if (averageSumDegrees < 38){
            System.out.println("Not good, you should be baking!");
        } else if (averageSumDegrees>=38 && averageSumDegrees<=42) {
            System.out.println("Super!");
        } else {
            System.out.println("Dilution with distilled water!");
        }
    }
}
