package PbExams1;

import java.util.Scanner;

public class CatWalking_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int minutesPerWalk = Integer.parseInt(scanner.nextLine());
        int countWalk = Integer.parseInt(scanner.nextLine());
        int caloriesTakenPerDay = Integer.parseInt(scanner.nextLine());

        int totalWalk = minutesPerWalk * countWalk;
        int totalCaloriesBurned = totalWalk * 5;
        double halfOfBurnedCalories = caloriesTakenPerDay * 0.5;

        if (totalCaloriesBurned >= halfOfBurnedCalories){
            System.out.printf("Yes, the walk for your cat is enough. Burned calories per day: %d.", totalCaloriesBurned);
        } else {
            System.out.printf("No, the walk for your cat is not enough. Burned calories per day: %d.", totalCaloriesBurned);
        }


    }
}
