import java.util.concurrent.ThreadLocalRandom;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcher {
    
    // This code consists of finding a certain value in a list/text using regex

    public static void main(String[] args) {
        String regex = "[a-cA-Z]";
        String text = ranText(150);

        Pattern pattern = Pattern.compile(regex);
        Matcher match = pattern.matcher(text);

        while (match.find()) {
            System.out.println(match.start() + " " + match.group());
        }

    }

    // Random character generator based on ASCII table
    
    public static String ranText(int textLength) {
        ThreadLocalRandom generate = ThreadLocalRandom.current(); 
        StringBuilder text = new StringBuilder();

        for (int i = 0; i < textLength; i++) {
            char c = (char) generate.nextInt(33, 126);
            text.append(c);
        }
        return text.toString();

    }

}