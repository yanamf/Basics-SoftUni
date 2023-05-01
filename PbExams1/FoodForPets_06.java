package PbExams1;

import java.util.Scanner;

public class FoodForPets_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        double foodQuantity = Double.parseDouble(scanner.nextLine());

        double treats = 0;
        double dogFoodGrams = 0;
        double catFoodGrams = 0;



        for (int i = 1; i <= days; i++) {
            int currentDogFood = Integer.parseInt(scanner.nextLine());
            int currentCatFood = Integer.parseInt(scanner.nextLine());
            dogFoodGrams += currentDogFood;
            catFoodGrams += currentCatFood;


            if (i % 3 == 0) {
                double treatsGram = (currentDogFood + currentCatFood) * 0.10;
                treats += treatsGram;
            }


        }
        double food = dogFoodGrams + catFoodGrams;
        double eatenFoodPercent = (food / foodQuantity) * 100;
        double eatenFoodPercentDog = (dogFoodGrams / food) * 100;
        double eatenFoodPercentCat = (catFoodGrams / food) * 100;
        double rounded = Math.round(treats);

        System.out.printf("Total eaten biscuits: %.0fgr.%n", rounded);
        System.out.printf("%.2f%% of the food has been eaten.%n", eatenFoodPercent);
        System.out.printf("%.2f%% eaten from the dog.%n", eatenFoodPercentDog);
        System.out.printf("%.2f%% eaten from the cat.", eatenFoodPercentCat);
    }
}
