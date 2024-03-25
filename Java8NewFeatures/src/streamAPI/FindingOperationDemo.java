package streamAPI;
/*
 * -> In Matching operations we can check weather data present in the stream or not based on given criteria. After checking the condition it returns true or false value.
-> By using Finding Operations we can check the condition and we can get the data based on condition.
• findFirst()
• findAny( )
 */
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FindingOperationDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		  List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

	        // Find the first even number
	        Optional<Integer> firstEven = numbers.stream()
	                                             .filter(n -> n % 2 == 0)
	                                             .findFirst();
	        if (firstEven.isPresent()) {
	            System.out.println("First even number: " + firstEven.get());
	        } else {
	            System.out.println("No even number found.");
	        }

	        // Find any odd number
	        Optional<Integer> anyOdd = numbers.stream()
	                                          .filter(n -> n % 2 != 0)
	                                          .findAny();
	        if (anyOdd.isPresent()) {
	            System.out.println("Any odd number: " + anyOdd.get());
	        } else {
	            System.out.println("No odd number found.");
	        }
	}

}
