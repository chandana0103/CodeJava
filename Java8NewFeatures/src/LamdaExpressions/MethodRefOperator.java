package LamdaExpressions;

import java.util.Arrays;
import java.util.function.Function;
import java.util.function.Predicate;

public class MethodRefOperator {

	public static void main(String[] args) {

		// Reference to a static method.
		String[] names = { "Charlie", "Bob", "Dave","Alice" };

		// Using lambda expression
		//Arrays.sort(names, (s1, s2) -> String.compare(s1, s2));

		// Using method reference
		Arrays.sort(names, String::compareTo);

		// Print sorted array
		Arrays.stream(names).forEach(System.out::println);

		// Reference to an instance method of a particular object.
		String str = "Hello, world!";

		// Using lambda expression
		Predicate<String> predicate1 = s -> str.contains(s);

		// Using method reference
		Predicate<String> predicate2 = str::contains;

		System.out.println(predicate1.test("world")); // true
		System.out.println(predicate2.test("world")); // true

		// Reference to an instance method of an arbitrary object of a particular type.
		// Using lambda expression
		Function<String, Integer> toInt1 = s -> s.length();

		// Using method reference
		Function<String, Integer> toInt2 = String::length;

		System.out.println(toInt1.apply("hello")); // 5
		System.out.println(toInt2.apply("hello")); // 5
		// Reference to a constructor.
		// Using lambda expression
		Function<String, StringBuilder> constructor1 = s -> new StringBuilder(s);

		// Using method reference
		Function<String, StringBuilder> constructor2 = StringBuilder::new;

		StringBuilder sb1 = constructor1.apply("Hello");
		StringBuilder sb2 = constructor2.apply("Hello");

		System.out.println(sb1.toString()); // Hello
		System.out.println(sb2.toString()); // Hello

	}
}
