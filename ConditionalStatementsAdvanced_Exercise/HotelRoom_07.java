package ConditionalStatementsAdvanced_Exercise;

import java.util.Scanner;

public class HotelRoom_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String month = scanner.nextLine();
        int countNights = Integer.parseInt(scanner.nextLine());

        double apartment = 0;
        double studio = 0;

        switch (month){
            case "May":
            case "October":
               studio = 50.0 * countNights;
               apartment = 65.0 * countNights;
                if (countNights>7 && countNights<14){
                    studio = studio - studio * 0.05;
                } else if (countNights>14) {
                    studio = studio - studio * 0.30;
                    apartment = apartment - apartment * 0.10;
                }
                break;

            case "June":
            case "September":
                studio = 75.20 * countNights;
                apartment = 68.70 * countNights;
                if (countNights>14){
                    studio = studio - studio * 0.20;
                    apartment = apartment - apartment * 0.10;
                }
                break;
            case "July":
            case "August":
                studio = 76.0 * countNights;
                apartment = 77.0 * countNights;
                if (countNights>14){
                apartment = apartment - apartment * 0.10;
                }

                break;

        }
        System.out.printf("Apartment: %.2f lv.%n", apartment);
        System.out.printf("Studio: %.2f lv.", studio);
    }
}
