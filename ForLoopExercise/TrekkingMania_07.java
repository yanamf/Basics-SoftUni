package ForLoopExercise;

import java.util.Scanner;

public class TrekkingMania_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countGroups = Integer.parseInt(scanner.nextLine());

        int musala = 0;
        int monblan = 0;
        int kilimandjaro = 0;
        int k2 = 0;
        int everest = 0;
        int totalPeople = 0;

        for (int i = 1; i <= countGroups ; i++) {
            int people = Integer.parseInt(scanner.nextLine());
            totalPeople += people;
            if (people <= 5){
                musala += people;
            } else if (people<=12) {
                monblan += people;
            } else if (people <= 25) {
                kilimandjaro+=people;
            } else if (people<=40) {
                k2 += people;
            } else {
                everest += people;
            }
        }


        double percentMusala = musala * 1.0 / totalPeople * 100;
        double percentMonblan = monblan * 1.0 / totalPeople * 100;
        double percentKilimandjaro = kilimandjaro * 1.0 / totalPeople * 100;
        double percentK2 = k2 * 1.0 / totalPeople * 100;
        double percentEverest = everest * 1.0 / totalPeople * 100;

        System.out.printf("%.2f%%%n", percentMusala);
        System.out.printf("%.2f%%%n", percentMonblan);
        System.out.printf("%.2f%%%n", percentKilimandjaro);
        System.out.printf("%.2f%%%n", percentK2);
        System.out.printf("%.2f%%%n", percentEverest);


    }
}
