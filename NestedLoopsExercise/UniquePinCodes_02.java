package NestedLoopsExercise;

import java.util.Scanner;

public class UniquePinCodes_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        int c = Integer.parseInt(scanner.nextLine());

        for (int n1 = 2; n1 <= a; n1++) {
            for (int n2 = 2; n2 <= b; n2++) {
                for (int n3 = 2; n3 <= c; n3++) {
                    if (n1 % 2 == 0 && n3 % 2 == 0 && (n2 >= 2 && n2 != 4 && n2 != 6 && n2 <= 7)) {
                        System.out.printf("%d %d %d%n", n1, n2, n3);
                    }
                }
            }
        }
    }
}


