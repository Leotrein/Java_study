import java.util.Random;
import java.util.Scanner;

public class Mines {

    // code made to see the assertiveness of blaze's "mines" game

    public static void main(String[] args) {

        double total = 0;
        double inv = 0;
        int count = 0;
        
        Scanner scan = new Scanner(System.in);

        System.out.print("\nHow many rounds? ");
        int rounds = scan.nextInt();

        System.out.print("\nStake: ");
        int stake = scan.nextInt();

        System.out.println();
        for (int i = 0; i < rounds; i++) {
            double result = playMines(stake);
            if (result < 0) {
                count++;
                System.out.println("Game " + (i+1) + " = " + result);
                double gale = playMines(stake * 3);
                System.out.println("Game " + (i+1) + " (Gale) = " + gale);
                total += gale;
                inv += (stake * 3);
            } else {
                System.out.println("Game " + (i+1) + " = " + result);
            }
            total += result;
            inv += stake;
        }
        System.out.println("\nTotal invested: " + inv);
        System.out.println("How many martin gales: " + count);

        if (total >= 0) {
            System.out.printf("%nProfit: %.2f%n", total);
        } else System.out.printf("%nLoss: %.2f%n", total);

        System.out.println("\nend\n");
        scan.close();

    }

    public static double playMines(int x) {

        double result = 0;
        double stake = x;
        double profit;

        Random randomNum = new Random();
        int[] bomb = new int[4];

        for (int i = 0; i < bomb.length; i++) {
            bomb[i] = randomNum.nextInt(25);
        }
        for (int i = 1; i <= 25; i++) {
            if (i == bomb[0] || i == bomb[1] || i == bomb[2] || i == bomb[3]) {
                profit = 0;
                result = profit - stake;
                break;
            } else if (i == 3) {
                profit = stake * 1.64;
                result = Math.abs(profit - stake);
                break;
            }
        }
        return result;

    }

}