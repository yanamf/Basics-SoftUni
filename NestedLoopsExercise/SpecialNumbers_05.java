package NestedLoopsExercise;

import java.util.Scanner;

public class SpecialNumbers_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 1111; i <= 9999 ; i++) {

            int firstNumber = i / 1000 % 10;
            int secondNumber = i / 100 % 10;
            int thirdNumber = i / 10 % 10;
            int fourthNumber = i % 10;

             boolean checkFirst = n % firstNumber == 0;
             boolean checkSecond = secondNumber !=0 && n % secondNumber == 0;
             boolean checkThird = thirdNumber !=0 && n % thirdNumber == 0;
             boolean checkFourth = fourthNumber !=0 && n % fourthNumber == 0;


             if (checkFirst && checkSecond && checkThird && checkFourth){
                 System.out.printf("%d ", i);
            }


        }
    }
}
