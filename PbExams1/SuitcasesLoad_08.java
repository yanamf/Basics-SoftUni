package PbExams1;

import java.util.Scanner;

public class SuitcasesLoad_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double backTruckCapacity = Double.parseDouble(scanner.nextLine());
        String input = scanner.nextLine();

        int counterSuitcase = 0;
        double availableSpace = backTruckCapacity;

        while (!input.equals("End")) {
            double volumeSuitcase = Double.parseDouble(input);

            if (availableSpace< volumeSuitcase){
                System.out.println("No more space!");
                break;
            }
            counterSuitcase++;
            if (counterSuitcase % 3 == 0) {
                volumeSuitcase = volumeSuitcase * 1.10;
                if (availableSpace<=volumeSuitcase){
                    System.out.println("No more space!");
                    counterSuitcase--;
                    break;
                }
            }
            availableSpace -= volumeSuitcase;
            input = scanner.nextLine();
        }
        if (input.equals("End")){
            System.out.println("Congratulations! All suitcases are loaded!");
        }
        System.out.printf("Statistic: %d suitcases loaded.", counterSuitcase);

    }
}
