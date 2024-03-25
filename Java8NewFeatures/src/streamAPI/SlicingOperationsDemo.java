package streamAPI;
/*
 * -> distinct ( ) -> it is used to get unique elements from the Stream
-> limit (long maxSize) -> it is used to get number of elements from the stream based on given size
-> skip (long n) -> it is used to skip elements from starting to given length and returns remaining elements.
 */
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SlicingOperationsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

	        // Slice first 5 elements
	        List<Integer> firstFive = numbers.stream()
	                                         .limit(5)
	                                         .collect(Collectors.toList());
	        System.out.println("First five elements: " + firstFive);

	        // Slice elements after skipping first 5
	        List<Integer> afterFive = numbers.stream()
	                                         .skip(5)
	                                         .collect(Collectors.toList());
	        System.out.println("Elements after skipping first five: " + afterFive);

	        // Slice elements between indexes 2 and 7 (exclusive)
	        List<Integer> betweenTwoAndSeven = numbers.stream()
	                                                  .skip(2)
	                                                  .limit(5)
	                                                  .collect(Collectors.toList());
	        System.out.println("Elements between indexes 2 and 7: " + betweenTwoAndSeven);

	        // Slice every nth element (e.g., every third element)
	        int nth = 3;
	        List<Integer> everyNth = numbers.stream()
	                                       .filter(n -> (numbers.indexOf(n) + 1) % nth == 0)
	                                       .collect(Collectors.toList());
	        System.out.println("Every " + nth + "th element: " + everyNth);
	    
	}

}
