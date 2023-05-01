package ForLoopExercise;

import java.util.Scanner;

public class CleverLily_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int age = Integer.parseInt(scanner.nextLine());
        double washingMachine = Double.parseDouble(scanner.nextLine());
        int toyPrice = Integer.parseInt(scanner.nextLine());

        int money = 0;
        int toys = 0;

        for (int currentAge = 1; currentAge <= age; currentAge++) {

            if (currentAge % 2 == 0) {
                money += 5 * currentAge - 1;
            } else {
                toys++;
            }
        }
        double sumTotal = toys * toyPrice + money;
        if (sumTotal>=washingMachine){
            System.out.printf("Yes! %.2f", sumTotal - washingMachine);
        } else {
            System.out.printf("No! %.2f", Math.abs(sumTotal-washingMachine));
        }
    }
}

