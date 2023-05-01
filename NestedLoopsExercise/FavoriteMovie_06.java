package NestedLoopsExercise;

import java.util.Scanner;

public class FavoriteMovie_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();

        int counter = 0;
        String bestMovie = "";
        int bestSum = Integer.MIN_VALUE;

        while (!name.equals("STOP")) {
            int sum = 0;
            counter++;
            if (counter > 7) {
                System.out.println("The limit is reached.");
                System.out.printf("The best movie for you is %s with %d ASCII sum.", bestMovie, bestSum);
            }
            for (int i = 0; i < name.length(); i++) {
                if (name.charAt(i) >= 65 && name.charAt(i) <= 90) {
                    sum += (name.charAt(i) - name.length());
                } else if (name.charAt(i) >= 97 && name.charAt(i) <= 122) {
                    sum += (name.charAt(i) - (name.length() * 2));
                    } else {
                    sum += name.charAt(i);
                }
            }
            if (sum>bestSum){
                bestSum = sum;
                bestMovie = name;
            }
            name = scanner.nextLine();
        }
        System.out.printf("The best movie for you is %s with %d ASCII sum.", bestMovie, bestSum);
    }
}
