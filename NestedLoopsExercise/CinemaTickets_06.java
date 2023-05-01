package NestedLoopsExercise;

import java.util.Scanner;

public class CinemaTickets_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String movieName = scanner.nextLine();
        int totalTickets = 0;
        int studentsTickets = 0;
        int standardTickets = 0;
        int kidsTickets = 0;

        while (!movieName.equals("Finish")){
            int availableSeats = Integer.parseInt(scanner.nextLine());
            String ticketType = scanner.nextLine();
            int movieTickets = 0;
            while (!ticketType.equals("End")){
                movieTickets++;
                switch (ticketType){
                    case "student":
                        studentsTickets++;
                        break;
                    case "standard":
                        standardTickets++;
                        break;
                    case "kid":
                        kidsTickets++;
                        break;
                }
                totalTickets++;
                if (movieTickets>=availableSeats){
                    break;
                }
                ticketType = scanner.nextLine();
            }
            double percentFullness = movieTickets * 1.0 / availableSeats * 100;
            System.out.printf("%s - %.2f%% full.%n", movieName, percentFullness);

            movieName = scanner.nextLine();
        }
        double percentStudentTickets = 1.0 * studentsTickets / totalTickets * 100;
        double percentStandardTickets = 1.0 * standardTickets / totalTickets * 100;
        double percentKidsTickets = 1.0 * kidsTickets / totalTickets * 100;


        System.out.printf("Total tickets: %d%n", totalTickets);
        System.out.printf("%.2f%% student tickets.%n", percentStudentTickets);
        System.out.printf("%.2f%% standard tickets.%n", percentStandardTickets);
        System.out.printf("%.2f%% kids tickets.", percentKidsTickets);

    }
}
