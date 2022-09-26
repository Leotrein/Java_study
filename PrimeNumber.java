import java.util.Scanner;

public class PrimeNumber {

    static String prime = "Prime number.";
    static String non = "It's not a prime number.";
    
    public static void main(String[] args) {

        System.out.println("\nPrime number checker.\n");

        Scanner scan = new Scanner(System.in);

        System.out.print("Input how many numbers do you want to verify: ");
        int rep = scan.nextInt();
        
        int num[] = new int[rep];

        for (int i = 0; i < rep; i++) {
            System.out.print("\nInput a number: ");
            num[i] = scan.nextInt();

            boolean init = num[i] >= 2 && num[i] % 1 == 0 && num[i] % num[i] == 0;

            if (num[i] != 2 && num[i] % 2 == 0) {
                System.out.println(non);
                    continue;
            } else if (init == false) {
                System.out.println(non);
                    continue;
            } else if (num[i] != 3 && num[i] % 3 == 0) {
                System.out.println(non);
                    continue;
            } else if (num[i] != 5 && num[i] % 5 == 0) {
                System.out.println(non);
                    continue;
            } else if (num[i] != 7 && num[i] % 7 == 0) {
                System.out.println(non);
                    continue;
            }

            for (int j = 2; j < 2147483647; j++) {
                if (j != num[i] && num[i] % j == 0) {
                        System.out.println(non);
                            break;
                } else if (num[i] == j) {
                    System.out.println(prime);
                }

            }

        }
        System.out.println("\nend\n");
        scan.close();

    }

}