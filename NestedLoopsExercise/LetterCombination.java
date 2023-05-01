package NestedLoopsExercise;

import java.util.Scanner;

public class LetterCombination {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char startLetter = scanner.nextLine().charAt(0);
        char endLetter = scanner.nextLine().charAt(0);
        char outcast = scanner.nextLine().charAt(0);

        int counter = 0;

        for (char i = startLetter; i <= endLetter; i++) {
            for (char j = startLetter; j <= endLetter; j++) {
                for (char k = startLetter; k <= endLetter; k++) {
                    if (k != outcast && i != outcast && j != outcast) {
                        System.out.print("" + i + j + k + " ");
                        counter++;
                    }

                }
            }
        }
        System.out.println(counter);
    }
}
