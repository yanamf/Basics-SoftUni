package PbExams1;

import java.util.Scanner;

public class MountainRun_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        double recordInSeconds = Double.parseDouble(scanner.nextLine());
        double distanceInMetersGeorge = Double.parseDouble(scanner.nextLine());
        double timeInSecondForOneMeter = Double.parseDouble(scanner.nextLine());


        double totalSeconds = distanceInMetersGeorge * timeInSecondForOneMeter;
        double slowedDown = Math.floor(distanceInMetersGeorge / 50) * 30;
        double totalTime = totalSeconds + slowedDown;

        if (recordInSeconds <= totalTime){
            System.out.printf("No! He was %.2f seconds slower.", totalTime - recordInSeconds);
        } else {
            System.out.printf("Yes! The new record is %.2f seconds.", totalTime);
        }

    }
}
