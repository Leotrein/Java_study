import java.util.Scanner;

public class Words {

    // Create a method that takes a string and returns the word count. The string will be a sentence.
    // it's a challenge (edabit.com (easy level))

    public static int countWords(String words) {
        int count = 1;
		
        for (Character c : words.toCharArray()) {
            if (c == ' ') {
                count++;
            }
        } return count;

	}

    public static void main(String[] args) {
        
        System.out.println("\nWord counter in a sentence\n");
        Scanner scan = new Scanner(System.in);

        System.out.print("Type a sentence: ");
        String words = scan.nextLine();

        System.out.println("\n" + countWords(words));
        scan.close();

        System.out.println("\nend\n");

    }
}