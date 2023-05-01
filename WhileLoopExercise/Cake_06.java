package WhileLoopExercise;

import java.util.Scanner;

public class Cake_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int height = Integer.parseInt(scanner.nextLine());
        int width = Integer.parseInt(scanner.nextLine());

        String input = scanner.nextLine();

        int countPieces = height * width;


        while (!input.equals("STOP")){
            int currentTake = Integer.parseInt(input);
            countPieces -= currentTake;

            if (countPieces<=0){
                System.out.printf("No more cake left! You need %d pieces more.", Math.abs(countPieces));
                break;
            }

            input = scanner.nextLine();
        }
        if (countPieces>=0){
            System.out.printf("%d pieces are left.", countPieces);
        }
    }
}
