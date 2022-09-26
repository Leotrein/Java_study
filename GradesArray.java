import java.util.Scanner;

public class GradesArray {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        double grades[] = new double[10];

        for (int i = 0; i < 10; i++) {
            System.out.println("\nInput the student grade: ");
            grades[i] = scan.nextDouble();
        }

        double totalGrades = 0;
        
        for (int i = 0; i < grades.length; i++) {
            totalGrades = totalGrades + grades[i];
        }

        double averageGrades = totalGrades / grades.length;
        System.out.println("\nThe average student grade is " + averageGrades + "\n");

        scan.close();
        
    }
}
