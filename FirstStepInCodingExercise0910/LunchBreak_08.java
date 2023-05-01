package FirstStepInCodingExercise0910;

import java.util.Scanner;

public class LunchBreak_08 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        int durationEpisode = Integer.parseInt(scanner.nextLine());
        int adDuration = Integer.parseInt(scanner.nextLine());

        double lunchTime = adDuration / 8.0;
        double restTime = adDuration / 4.0;

        double timeLeft = adDuration - lunchTime - restTime;


        if (timeLeft>=durationEpisode){
            double diff = Math.ceil(timeLeft-durationEpisode);
            System.out.printf("You have enough time to watch %s and left with %.0f minutes free time.", name, diff);
        } else {
            double diff = Math.ceil(durationEpisode-timeLeft);
            System.out.printf("You don't have enough time to watch %s, you need %.0f more minutes.", name, diff);
        }
    }
}
