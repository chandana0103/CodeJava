package streamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.Spliterator;

/*
 * Like Iterator and ListIterator, Spliterator is a Java Iterator, which is used to iterate elements one-by-one from a List implemented object. Some important points about Java Spliterator are:
• Java Spliterator is an interface in Java Collection API.
• Spliterator is introduced in Java 8 release in java.util package.
• It supports Parallel Programming functionality.
• We can use it for both Collection API and Stream API classes
 * 
 */
public class SpliteratorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> l=new ArrayList<>();
		l.add("hello");
		l.add("where");
		l.add("anu");
		
		Spliterator<String> st=l.spliterator();		//	getting spliterator
		st.forEachRemaining(System.out::println);	//traversing elements
		
		
		List<Integer> numbers = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            numbers.add(i);
        }

        // Get the spliterator for the list
        Spliterator<Integer> spliterator = numbers.spliterator();

        // Iterate over the elements using tryAdvance
        System.out.println("Iterating over the elements using tryAdvance:");
        while (spliterator.tryAdvance(System.out::println)) ;

        // Create a new spliterator for the list
        spliterator = numbers.spliterator();

        // Iterate over the elements using forEachRemaining
        System.out.println("\nIterating over the elements using forEachRemaining:");
        spliterator.forEachRemaining(System.out::println);
    
	}

}
