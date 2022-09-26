
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

// this code is a challenge that consists of taking an array or a list with integers,
// transforming them into binarys (string), taking the inverse of the binarys numbers (string) 
// and transforming it to an integer, using map and stream.

public class BinarysMap {
 
    public static void main(String[] args) {

        System.out.println("\nMap Challenge\n");
        
        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

        Consumer<String> print = System.out::print;
        Function<String, String> reverse = e -> new StringBuilder(e).reverse().toString();
        Function<String, Integer> conv = e -> Integer.parseInt(e, 2);
        
        Function<Integer, String> format = e -> {return String.format("%d ", e);};

        nums.stream().map(e -> Integer.toBinaryString(e)).map(reverse).map(conv).map(format).forEach(print);;
     
        System.out.println("\n\nend\n");

        // 1 2 3 4 5 6 7 8 9
        // 1 1 3 1 5 3 7 1 9

        // 1 10 11 100 101 110 111 1000 1001
        // 1 01 11 001 101 011 111 0001 1001 

    }
}
