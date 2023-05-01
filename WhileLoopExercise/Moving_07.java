package WhileLoopExercise;

import java.util.Scanner;

public class Moving_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int width = Integer.parseInt(scanner.nextLine());
        int length = Integer.parseInt(scanner.nextLine());
        int height = Integer.parseInt(scanner.nextLine());
        int cubicMetersAvailable = width * length * height;
        int cubicMetersTransferred = 0;

        String command = scanner.nextLine();

        while (!command.equals("Done")){
            int quantityBoxes = Integer.parseInt(command);
            cubicMetersTransferred += quantityBoxes;

            if (cubicMetersTransferred>cubicMetersAvailable){
                System.out.printf("No more free space! You need %d Cubic meters more.", Math.abs(cubicMetersTransferred-cubicMetersAvailable));
                break;
            }

            command = scanner.nextLine();
        }
        if (cubicMetersAvailable>cubicMetersTransferred){
            System.out.printf("%d Cubic meters left.", cubicMetersAvailable-cubicMetersTransferred);
        }
    }
}
