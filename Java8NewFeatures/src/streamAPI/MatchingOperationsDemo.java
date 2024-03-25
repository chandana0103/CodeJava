package streamAPI;
/*
 * Matching Operations in the streams
-> Matching operations are terminal operations that are used to check if elements with certain are present in the stream or not.
-> There are mainley three matching functions available in the Stream. these are
o anyMatch ( )
o allMatch( )
o noneMatch( )
 */
import java.util.Arrays;
import java.util.List;

public class MatchingOperationsDemo {


		 public static void main(String[] args) {
		        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

		        // Check if all elements are even
		        boolean allEven = numbers.stream().allMatch(n -> n % 2 == 0);
		        System.out.println("Are all elements even? " + allEven);

		        // Check if any element is divisible by 5
		        boolean anyDivisibleByFive = numbers.stream().anyMatch(n -> n % 5 == 0);
		        System.out.println("Is any element divisible by 5? " + anyDivisibleByFive);

		        // Check if none of the elements are negative
		        boolean noneNegative = numbers.stream().noneMatch(n -> n < 0);
		        System.out.println("Are there no negative elements? " + noneNegative);
		    }
	

}
