package WhileLoopLab;

import java.util.Scanner;

public class MinNumber_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        int minNumber = Integer.MAX_VALUE;

        while (!input.equals("Stop")){
            int currentNumber = Integer.parseInt(input);
            if (currentNumber<minNumber){
                minNumber = currentNumber;
            }

            input = scanner.nextLine();
        }
        System.out.printf("%d", minNumber);
    }
}
