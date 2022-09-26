import java.util.Scanner;

public class LeapYear {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.println("Input a year: ");
        int year = scan.nextInt();
        
        String result = (year % 400 == 0 || year % 4 == 0 && year % 100 != 0) ? year + " it's a leap year.": 
        year + " it's not a leap year.";
        
        System.out.println(result);
        scan.close();
            
    }
}
