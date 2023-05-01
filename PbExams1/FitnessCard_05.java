package PbExams1;

import java.util.Scanner;

public class FitnessCard_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        double myMoney = Double.parseDouble(scanner.nextLine());
        String gender = scanner.nextLine();
        int age = Integer.parseInt(scanner.nextLine());
        String sport = scanner.nextLine();
        double monthlyPass = 0;

        switch (sport) {
            case "Gym":
                if (gender.equals("m")) {
                    monthlyPass = 42;
                }
                if (gender.equals("f")) {
                    monthlyPass = 35;
                }
                break;
            case "Boxing":
                if (gender.equals("m")) {
                    monthlyPass = 41;
                }
                if (gender.equals("f")) {
                    monthlyPass = 37;
                }
                break;
            case "Yoga":
                if (gender.equals("m")) {
                    monthlyPass = 45;
                }
                if (gender.equals("f")) {
                    monthlyPass = 42;
                }
                break;
            case "Zumba":
                if (gender.equals("m")) {
                    monthlyPass = 34;
                }
                if (gender.equals("f")) {
                    monthlyPass = 31;
                }
                break;
            case "Dances":
                if (gender.equals("m")) {
                    monthlyPass = 51;
                }
                if (gender.equals("f")) {
                    monthlyPass = 53;
                }
                break;
            case "Pilates":
                if (gender.equals("m")) {
                    monthlyPass = 39;
                }
                if (gender.equals("f")) {
                    monthlyPass = 37;
                }
                break;
        }
        if (age <= 19) {
            monthlyPass = monthlyPass * 0.80;
        }
        if (monthlyPass <= myMoney) {
            System.out.printf("You purchased a 1 month pass for %s.", sport);
        } else {
            System.out.printf("You don't have enough money! You need $%.2f more.",
                    monthlyPass - myMoney);
        }
    }


}

