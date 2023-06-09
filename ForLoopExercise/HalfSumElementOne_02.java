package ForLoopExercise;

import java.util.Scanner;

public class HalfSumElementOne_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int maxNumber = Integer.MIN_VALUE;
        int sum = 0;

        for (int i = 0; i < n; i++) {
            int number = Integer.parseInt(scanner.nextLine());
            sum += number;

            if (number > maxNumber) {
                maxNumber = number;
            }
        }
            int sumWithoutMax = sum - maxNumber;

            if (sumWithoutMax == maxNumber){
                System.out.printf("Yes%nSum = %d", maxNumber);
            } else {
                System.out.printf("No%nDiff = %d", Math.abs(maxNumber-sumWithoutMax));
            }
        }
    }

