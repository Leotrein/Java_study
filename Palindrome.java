import java.util.Scanner;

public class Palindrome {

    public static boolean isPalindrome(String text) {

        return text.equals(new StringBuilder(text).reverse().toString());

    }
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.print("\nType a word: ");
        String word = scan.next();

        isPalindrome(word);
        
        if (isPalindrome(word)) {
            System.out.println("\nIs palindrome.");
        } else {
            System.out.println("\nNot a palindrome.");
        }
        System.out.println("\nend\n");
        scan.close();

    }
}
