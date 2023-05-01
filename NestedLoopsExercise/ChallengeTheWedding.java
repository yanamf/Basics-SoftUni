package NestedLoopsExercise;

import java.util.Scanner;

public class ChallengeTheWedding {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int men = Integer.parseInt(scanner.nextLine());
        int women = Integer.parseInt(scanner.nextLine());
        int tables = Integer.parseInt(scanner.nextLine());

        int counter = 0;

        for (int m = 1; m <= men; m++) {
            for (int f = 1; f <= women; f++) {
                System.out.printf("(%d <-> %d) ", m, f);
                counter++;
                if (counter == tables) {
                    return;
                }

            }

        }
    }
}
