import java.util.Scanner;

public class Matrix {
    
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        
        System.out.print("\nInput how many lines: ");
        int rep = scan.nextInt();

        System.out.print("\nInput how many columns: ");
        int rep1 = scan.nextInt();
        
        int[][] matrix = new int[rep][rep1];
            
        System.out.printf("\nMatrix [%d][%d]\n", rep, rep1);
        
        for (int line = 0 ; line < rep; line++) {
            for (int column = 0; column < rep1; column++) {
                System.out.printf("\nInput the element [%d][%d]: ", line + 1, column + 1);
                matrix[line][column] = scan.nextInt();
            }
        }
        
        System.out.println("\nThe matrix is: \n");

        for(int line = 0; line < rep; line++) {
            for(int column = 0; column < rep1; column++) {
                System.out.printf("\t %d \t", matrix[line][column]);
            }
            System.out.println();

        }
        System.out.println("\nend\n");
        scan.close();

    }
}
