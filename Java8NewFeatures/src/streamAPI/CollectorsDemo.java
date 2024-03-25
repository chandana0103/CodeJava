package streamAPI;
/*
 * Collectors In Streams
-> Collectors operations are used to collect from Streams
-> We are having below methods to perform Collectors operations
Collectors.toList()
Collectors.toSet()
Collectors.toMap()
Collectors.toCollection() etc..
 */

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class CollectorsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 List<String> words = Arrays.asList("hello", "world", "java", "stream", "example");

	        // Collect elements into a list
	        List<String> collectedList = words.stream()
	                                         .collect(Collectors.toList());
	        System.out.println("Collected list: " + collectedList);

	        // Collect elements into a set
	        Set<String> collectedSet = words.stream()
	                                       .collect(Collectors.toSet());
	        System.out.println("Collected set: " + collectedSet);

	        // Collect elements into a map where the key is the word and the value is its length
	        Map<String, Integer> wordLengthMap = words.stream()
	                                                  .collect(Collectors.toMap(word -> word, String::length));
	        System.out.println("Word length map: " + wordLengthMap);

	        // Joining elements into a single string
	        String concatenatedString = words.stream()
	                                         .collect(Collectors.joining(", "));
	        System.out.println("Concatenated string: " + concatenatedString);

	        // Grouping elements by their length
	        Map<Integer, List<String>> groupedByLength = words.stream()
	                                                         .collect(Collectors.groupingBy(String::length));
	        System.out.println("Grouped by length: " + groupedByLength);
	}

}
