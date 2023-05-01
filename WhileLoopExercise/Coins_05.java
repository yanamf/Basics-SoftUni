package WhileLoopExercise;

import java.util.Scanner;

public class Coins_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double sum = Double.parseDouble(scanner.nextLine());
        double totalCoins = Math.floor(sum * 100);
        int coinsQuantity = 0;

        while (totalCoins > 0){

            if (totalCoins>=200){
                totalCoins-=200;
                coinsQuantity++;
            } else if (totalCoins>=100) {
                totalCoins-=100;
                coinsQuantity++;
            } else if (totalCoins>=50) {
                totalCoins-=50;
                coinsQuantity++;
            } else if (totalCoins>=20) {
                totalCoins-=20;
                coinsQuantity++;
            } else if (totalCoins>=10) {
                totalCoins-=10;
                coinsQuantity++;
            } else if (totalCoins>=5) {
                totalCoins-=5;
                coinsQuantity++;
            } else if (totalCoins>=2) {
                totalCoins-=2;
                coinsQuantity++;
            } else if (totalCoins>=1) {
                totalCoins-=1;
                coinsQuantity++;
            }

        }
        System.out.println(coinsQuantity);
    }
}
