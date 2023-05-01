package TestExam;

import java.util.Scanner;

public class HairSalon_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int goal = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        String input = scanner.nextLine();

        while (sum<goal) {
            if (input.equals("closed")){
                break;
            }
            if (input.equals("haircut")) {
                String typeService = scanner.nextLine();
                switch (typeService) {
                    case "mens":
                        sum += 15;
                        break;
                    case "ladies":
                        sum += 20;
                        break;
                    case "kids":
                        sum += 10;
                        break;
                }
            }
            if (input.equals("color")) {
                String typeService = scanner.nextLine();
                switch (typeService) {
                    case "touch up":
                        sum += 20;
                        break;
                    case "full color":
                        sum += 30;
                        break;
                }
            }
            if (sum >= goal) {
                System.out.println("You have reached your target for the day!");
                break;
            }
            input = scanner.nextLine();
        }

        if (sum < goal){
            System.out.printf("Target not reached! You need %dlv. more.%n", goal-sum);
        }
        System.out.printf("Earned money: %dlv.", sum);


    }
}
