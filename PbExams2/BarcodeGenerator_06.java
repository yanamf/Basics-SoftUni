package PbExams2;

import java.util.Scanner;

public class BarcodeGenerator_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int start = Integer.parseInt(scanner.nextLine());
        int end = Integer.parseInt(scanner.nextLine());

        for (int i = start; i <= end ; i++) {
            for (int j = start; j <= end ; j++) {
                for (int k = start; k <= end; k++) {
                    for (int l = start; l <= end ; l++) {
                        if (i % 2 == 0 && j % 2 == 0 && k % 2 == 0 && l % 2 == 0){
                            break;
                        } else {
                            System.out.printf("%d%d%d%d", i, j, k, l);
                        }

                    }

                }

            }

        }
    }
}
