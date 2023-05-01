package PbExams1;

import java.util.Scanner;

public class CareOfPuppy_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int boughtFoodInKg = Integer.parseInt(scanner.nextLine());
        String input = scanner.nextLine();
        int food = 0;

        while (!input.equals("Adopted")){
            int gramsFood = Integer.parseInt(input);
            food += gramsFood;


            input = scanner.nextLine();
        }
        boughtFoodInKg = boughtFoodInKg * 1000;
        if (boughtFoodInKg >= food){
            System.out.printf("Food is enough! Leftovers: %d grams.", boughtFoodInKg-food);
        } else {
            System.out.printf("Food is not enough. You need %d grams more.", Math.abs(boughtFoodInKg-food));
        }
    }
}
