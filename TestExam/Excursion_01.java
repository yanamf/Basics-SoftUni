package TestExam;

import java.util.Scanner;

public class Excursion_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int people = Integer.parseInt(scanner.nextLine());
        int nights = Integer.parseInt(scanner.nextLine());
        int busCard = Integer.parseInt(scanner.nextLine());
        int museumTicket = Integer.parseInt(scanner.nextLine());

        int nightsSum = nights * 20;
        double bussCardSum = busCard * 1.60;
        int museumTicketSum =  museumTicket * 6;

        double totalSumForOne = nightsSum + bussCardSum + museumTicketSum;

        double totalSum = totalSumForOne * people;

        double finalSum = totalSum * 1.25;

        System.out.printf("%.2f", finalSum);
    }
}
