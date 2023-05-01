package ForLoopExercise;

import java.util.Scanner;

public class Oscars_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String actorName = scanner.nextLine();
        double pointsFromAcademy = Double.parseDouble(scanner.nextLine());
        int countJudges = Integer.parseInt(scanner.nextLine());
        double totalPoints = pointsFromAcademy;

        for (int i = 1; i <= countJudges; i++) {
            String nameJudge = scanner.nextLine();
            double pointsFromJudge = Double.parseDouble(scanner.nextLine());
            double currentPoints = (nameJudge.length() * pointsFromJudge) / 2;
            totalPoints += currentPoints;

            if (totalPoints > 1250.5) {
                System.out.printf("Congratulations, %s got a nominee for leading role with %.1f!", actorName, totalPoints);
                break;
            }
        }
        if (totalPoints < 1250.5) {
            System.out.printf("Sorry, %s you need %.1f more!", actorName, 1250.5 - totalPoints);

        }
    }
}

