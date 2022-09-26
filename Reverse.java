import java.util.Scanner;

public class Reverse {

    // Write a function that reverses a string. Make your function recursive.
    // it's a challenge (edabit.com (medium level))

    public static String reverse(String str)  {
        StringBuffer s = new StringBuffer();
        return s.append(str).reverse().toString();

    }

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.println("Type a word: ");
        String str = scan.nextLine();

        System.out.println(reverse(str));

        scan.close();
        System.out.println("\nend\n");

    }
}