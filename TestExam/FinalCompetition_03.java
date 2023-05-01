package TestExam;

import java.util.Scanner;

public class FinalCompetition_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int dancers = Integer.parseInt(scanner.nextLine());
        double points = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();
        String place = scanner.nextLine();
        double sum = 0;

        if (place.equals("Bulgaria")) {
            sum = dancers * points;
            switch (season) {
                case "summer":
                sum *= 0.95;
                break;
                case "winter":
                    sum *= 0.92;
                    break;
            }
        } if (place.equals("Abroad")) {
            sum = (dancers * points) * 1.50;
            switch (season){
                case "summer":
                    sum *= 0.90;
                    break;
                case "winter":
                    sum *= 0.85;
                    break;
            }
        }
        double charity = sum * 0.75;
        double leftSum = sum * 0.25;
        double sumForOnePerson = leftSum / dancers;

        System.out.printf("Charity - %.2f%n", charity);
        System.out.printf("Money per dancer - %.2f", sumForOnePerson);
    }
}

