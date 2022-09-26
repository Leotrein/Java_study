import java.util.Scanner;

public class BinarysTest {
    
    public static String catchNum(int x) {
        Long total = 1L;
    
        for (int i = 1; i < x; i++) {
            total *= 2;
        } return Long.toBinaryString(total);
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int decision = 0;
        Long num = 0L;

        while (decision != 4) {
                try {
                    System.out.printf("%n%10s %n%nBinary checker %d %n%n[%d] - Number to binary", "-----", 2000, 1);
                    System.out.printf("%n[%d] - Binary by amount of bits%n[%d] - Binary to number%n[%d] - Out%n", 2, 3, 4);
                    System.out.print("\nInput: ");
                    decision = scan.nextInt();
                    if (decision != 1 || decision != 2 || decision != 3 || decision != 4) {
                        decision = 0;
                        throw new Exception();
                    }
                } catch (Exception e) {
                    System.out.println("Error!");
                    // check treatment for a string
                } 

            if (decision == 1) {
                System.out.print("\nType a number: ");
                num = scan.nextLong();
                System.out.println("\nBinary: " + Long.toBinaryString(num) + "\n");
            } else if (decision == 2) {
                System.out.print("\nHow many bits (Max 64): ");
                int x = scan.nextInt();
        
                int count = 0;
                String binary = catchNum(x);
        
                for (int j = 0; j < binary.length(); j++) {
                    count++;
                } if (count == x) {
                    num = Long.parseLong(binary, 2);
                    System.out.println("\nBinary: " + binary);
                    System.out.println("\nInteger: " + num);
                    System.out.println("\nDigits: " + Long.toString(num).length() + "\n");;
                }
    
            } else if (decision == 3) {
                System.out.print("\nType a binary: ");
                String binary = scan.next();
                num = Long.parseLong(binary, 2);
                System.out.println("\nInteger: " + num + "\n");
            } else continue;
            
        }
        System.out.println("\nend\n");
        scan.close();
        
    }

}