package ForLoopExercise;

import java.util.Scanner;

public class TennisRanklist_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countTournaments = Integer.parseInt(scanner.nextLine());
        int initialPoints = Integer.parseInt(scanner.nextLine());

        int sumPoints = initialPoints;
        int countWins = 0;

        for (int i = 1; i <= countTournaments; i++) {
            String tournament = scanner.nextLine();

            if ("W".equals(tournament)) {
                sumPoints += 2000;
                countWins++;
            } else if ("F".equals(tournament)) {
                sumPoints += 1200;
            } else if ("SF".equals(tournament)) {
                sumPoints += 720;

            }

        }
            int tournamentPoints = sumPoints - initialPoints;

            double percentWins = (countWins * 1.0 / countTournaments) * 100;

            System.out.printf("Final points: %d%n", sumPoints);
            System.out.printf("Average points: %d%n", tournamentPoints / countTournaments);
            System.out.printf("%.2f%%", percentWins);


        }


    }


