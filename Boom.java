import java.util.Arrays;
import java.util.Random;

public class Boom {

    // Create a function that takes an array of numbers and return "Boom!" if the digit 7 appears in the array. 
    // Otherwise, return "there is no 7 in the array".
    // it's a challenge (edabit.com (medium level))
    
    public static String sevenBoom(Integer[] arr) {
		return Arrays.toString(arr).contains("7") ? "Boom!" 
			: "there is no 7 in the array"; 

	}

    public static Integer[] randomList() {
        Random randomNum = new Random();
        Integer[] arr = new Integer[1000]; 

        for (int i = 0; i < arr.length; i++) {
            arr[i] = randomNum.nextInt(1000);
        } return arr;

    }

    public static void main(String[] args) {
        
        System.out.println("\n7 checker in a list\n");
        // actually with this code you can check any character in a list

        System.out.println(sevenBoom(randomList()));
        System.out.println("\nend\n");

        // Stream.of(listRandom1000()).forEach(System.out::println);
        // For check randomList

    }

}