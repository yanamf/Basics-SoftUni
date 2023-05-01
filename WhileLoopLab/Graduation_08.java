package WhileLoopLab;

import java.util.Scanner;

public class Graduation_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String student = scanner.nextLine();

        int goodGradesCount = 1;
        int poorGradesCount = 0;
        double allGradesSum = 0;
        boolean isExcluded = false;
        while (goodGradesCount<= 12){

            if (poorGradesCount == 2) {
                isExcluded = true;
                break;
            }
            double currentGrade = Double.parseDouble(scanner.nextLine());

            if (currentGrade < 4 ){
            poorGradesCount++;
            continue;
        }
            allGradesSum += currentGrade;
            goodGradesCount++;
        }

        double averageScore = allGradesSum / 12;
        if (isExcluded){
            System.out.printf("%s has been excluded at %d grade", student, goodGradesCount );
        } else {
            System.out.printf("%s graduated. Average grade: %.2f", student, averageScore);
        }

        }

    }

