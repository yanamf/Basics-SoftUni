package NestedLoopsExercise;

import java.util.Scanner;

public class UniquePinCodes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n1 = Integer.parseInt(scanner.nextLine());
        int n2 = Integer.parseInt(scanner.nextLine());
        int n3 = Integer.parseInt(scanner.nextLine());

        for (int i = 2; i <= n1; i++) {
            if (i % 2 == 0) {
                System.out.printf("%d ", i);
            }
            int counter = 1;
            for (int j = 2; j <= n2; j++) {
                if (n2 % j == 0) {
                    counter++;
                }
                if (counter == 2) {
                    System.out.printf("%d ", j);
                }
                for (int k = 2; k <= n3; k++) {
                    if (k % 2 == 0) {
                        System.out.printf("%d ", k);
                    }
                }
            }
        }
    }
}

