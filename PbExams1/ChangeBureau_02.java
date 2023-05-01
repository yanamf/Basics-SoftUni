package PbExams1;

import java.util.Scanner;

public class ChangeBureau_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int bitcoinCount = Integer.parseInt(scanner.nextLine());
        double chineseYuanCount = Double.parseDouble(scanner.nextLine());
        double commissionCount = Double.parseDouble(scanner.nextLine());


        double bitcoin = bitcoinCount * 1168;
        double yuan = (chineseYuanCount * 0.15) * 1.76;
        double totalMoney = bitcoin + yuan;
        double euro = totalMoney / 1.95;
        double commission = (commissionCount * 0.01) * euro;
        double result = euro - commission;

        System.out.printf("%.2f", result);




    }
}

