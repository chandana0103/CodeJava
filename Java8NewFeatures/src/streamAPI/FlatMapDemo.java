package streamAPI;
//-> When we have Collection inside another collection then to flaten that stream we will use flatMap( ) method.
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapDemo {

    public static void main(String[] args) {

	 List<List<Integer>> nestedList = Arrays.asList(
             Arrays.asList(1, 2, 3),
             Arrays.asList(4, 5, 6),
             Arrays.asList(7, 8, 9)
     );

     List<Integer> flattenedList = nestedList.stream()
                                             .flatMap(List::stream)
                                             .collect(Collectors.toList());
     System.out.println("Flattened list: " + flattenedList);

     // Example 2: Flattening a list of strings into characters
     List<String> words = Arrays.asList("hello", "world", "java");

     List<Character> characters = words.stream()
                                      .flatMap(word -> word.chars().mapToObj(c -> (char) c))
                                      .collect(Collectors.toList());
     System.out.println("Flattened characters: " + characters);
 }
}
