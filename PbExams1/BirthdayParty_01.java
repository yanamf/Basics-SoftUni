package PbExams1;

import java.util.Scanner;

public class BirthdayParty_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double rentPlace = Double.parseDouble(scanner.nextLine());

        double cake = rentPlace * 0.20;
        double beverage = cake * 0.55;
        double animator = 1.0 * 1/3 * rentPlace;

        double neededMoney = rentPlace + cake + beverage + animator;
        System.out.println(neededMoney);
    }
}
