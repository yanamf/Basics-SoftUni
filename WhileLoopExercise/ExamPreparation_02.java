package WhileLoopExercise;

import java.util.Scanner;

public class ExamPreparation_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int failedThreshold = Integer.parseInt(scanner.nextLine());

        int failedTimes = 0;
        int solvedProblemsCount = 0;
        double gradesSum = 0;
        String lastProblem = "";
        boolean isFailed = true;


        while (failedTimes < failedThreshold){
            String problemName = scanner.nextLine();

            if ("Enough".equals(problemName)){
                isFailed = false;
                break;
            }
            int grade = Integer.parseInt(scanner.nextLine());
            if (grade<=4){
                failedTimes++;
            }
            gradesSum+=grade;
            solvedProblemsCount++;
            lastProblem = problemName;
        }
        if (isFailed){
            System.out.printf("You need a break, %d poor grades.", failedThreshold);
        } else {
            System.out.printf("Average score: %.2f%n", gradesSum / solvedProblemsCount);
            System.out.printf("Number of problems: %d%n", solvedProblemsCount);
            System.out.printf("Last problem: %s", lastProblem);
        }
    }

}
