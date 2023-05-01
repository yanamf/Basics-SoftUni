package ConditionalStatementsAdvanced_Exercise;

import java.util.Scanner;

public class SummerOutfit_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int degrees = Integer.parseInt(scanner.nextLine());
        String dayTime = scanner.nextLine();
        String shoes = "";
        String outfit = "";


        if ("Morning".equals(dayTime)) {
            if (10 <= degrees && degrees <= 18) {
                outfit = "Sweatshirt";
                shoes = "Sneakers";
            } else if (18 < degrees && degrees <= 24) {
                outfit = "Shirt";
                shoes = "Moccasins";
            } else {
                outfit = "T-Shirt";
                shoes = "Sandals";
            } System.out.printf("It's %d degrees, get your %s and %s.", degrees, outfit, shoes);
        } if ("Afternoon".equals(dayTime)) {
            if (10 <= degrees && degrees <= 18) {
                outfit = "Shirt";
                shoes = "Moccasins";
            } else if (18 < degrees && degrees <= 24) {
                outfit = "T-Shirt";
                shoes = "Sandals";
            } else {
                outfit = "Swim Suit";
                shoes = "Barefoot";
            } System.out.printf("It's %d degrees, get your %s and %s.", degrees, outfit, shoes);

        } if ("Evening".equals(dayTime)){
                    if (10<=degrees && degrees <= 18) {
                        outfit = "Shirt";
                        shoes = "Moccasins";

                    } else if (18<degrees && degrees<=24) {
                        outfit = "Shirt";
                        shoes = "Moccasins";
                    } else  {
                        outfit = "Shirt";
                        shoes = "Moccasins";
                    } System.out.printf("It's %d degrees, get your %s and %s.", degrees, outfit, shoes);

                }


            }
        }

