package NestedLoopsLab;

import java.util.Scanner;

public class SumOfTwoNumbers_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int start = Integer.parseInt(scanner.nextLine());
        int end = Integer.parseInt(scanner.nextLine());
        int magicNumber = Integer.parseInt(scanner.nextLine());
        int counter = 0;
        boolean isFound = false;
        int firstNumber = 0;
        int secondNumber = 0;

        for (int i = start; i <= end; i++) {
            for (int j = start; j <= end; j++) {
                counter++;
                if (i + j == magicNumber) {
                    isFound = true;
                    firstNumber = i;
                    secondNumber = j;
                    break;
                }

            }
            if (isFound) {
                break;
            }
        }
        if (isFound) {
            System.out.printf("Combination N:%d (%d + %d = %d)", counter, firstNumber, secondNumber, magicNumber);
        } else {
            System.out.printf("%d combinations - neither equals %d", counter, magicNumber);

        }
    }
}
