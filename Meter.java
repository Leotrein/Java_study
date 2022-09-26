import java.util.Scanner;

public class Meter {

public static void main(String[] args) {

    int meter = 56;
    int totalMen = 0;
    int totalWoman = 0;
    
    Scanner scan = new Scanner(System.in);

    while (meter > 0 ) {
        System.out.print("\nInput your name: ");
        String name = scan.nextLine();
        
        System.out.print("\nInput your gender (M = Male, F = Female): ");
        char gender = scan.next().charAt(0);

        if (gender == 'm' || gender == 'M') {
            totalMen += 1;
            meter -= 1;
            System.out.println("\n" + name + " - gender: Male\n");
            System.out.println(totalMen + " Men and " + totalWoman + " Woman.\n");         
            } else if (gender == 'f' || gender == 'F'){
                totalWoman += 1;
                meter -= 1;
                System.out.println("\n" + name + " - sexo: Female\n");  
                System.out.println(totalMen + " Men and " + totalWoman + " Woman.\n");
            } 
        
        }
        scan.close();

    }
}
