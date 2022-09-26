import java.util.Scanner;

public class PrimeNumbers2 {

    // How Many "Prime Numbers" Are There? (number one doesn't count)
    // it's a challenge (edabit.com (hard level))

    public static int primeNumbers(int num) {
        int count = 0;

        for (int i = 2; i < num; i++) {
            boolean init = i >= 1 && i % 1 == 0 && i % i == 0;
            for (int j = 1; j < num; j++) {
                if (j != 1 && j != i && i % j == 0) {
                    break;
                } else if (init == true && i == j) {
                    count++;
                    break;
                }
            
            }
        }
        return count;
    }

    public static void main(String[] args) {

        System.out.println("\nHow Many Prime Numbers Are There? (number one doesn't count)\n");
        Scanner scan = new Scanner(System.in);

        System.out.print("Type a number: ");
        int num = scan.nextInt();

        System.out.println("\n" + primeNumbers(num));
        scan.close();

        System.out.println("\nend\n");

    }
}