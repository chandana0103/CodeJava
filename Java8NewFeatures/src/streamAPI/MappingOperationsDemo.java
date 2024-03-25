package streamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*
 * Mapping Operations In Streams
-> Mapping operations are belonging to Intermediate operations
-> Mapping operations are those operations that transform the elements of a stream 
and return a new stream with transformed elements.
 */
public class MappingOperationsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 List<String> words = Arrays.asList("hello", "world", "java", "stream", "example");

	        // Example 1: Convert all words to uppercase
	        List<String> upperCaseWords = words.stream()
	                                           .map(String::toUpperCase)
	                                           .collect(Collectors.toList());
	        System.out.println("Uppercase words: " + upperCaseWords);

	        // Example 2: Find the length of each word
	        List<Integer> wordLengths = words.stream()
	                                        .map(String::length)
	                                        .collect(Collectors.toList());
	        System.out.println("Word lengths: " + wordLengths);

	        // Example 3: Concatenate each word with its length
	        List<String> wordLengthPairs = words.stream()
	                                           .map(word -> word + " - " + word.length())
	                                           .collect(Collectors.toList());
	        System.out.println("Word length pairs: " + wordLengthPairs);
	
	}

}
