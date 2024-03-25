package LamdaExpressions;

import java.util.Random;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
/*
 * Predefined Functional Interfaces
 * There are several predefined functional interfaces provided by java 8
 * 1) Predicate:It is used to perform some conditional check and returns true or false value
 * 2) Function:Function is a category of functional interfaces that takes an object of type T and returns an object of type R.
 * 3) Consumer:Consumer will accept values and will perform operation but it won't return any value
 * 4) Supplier:Supplier is an interface that does not take in any argument but produces a value when the get() function is invoked.
 */
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class FunctionalInterfaceDemo {

	public static void main(String[] args) {

/***************************************************************************************************************************************/

		 // Predicate to check if a number is greater than 10
        Predicate<Integer> greaterThanTen = num -> num > 10;
        
        // Test the predicate
        System.out.println("1 "+greaterThanTen.test(5));   // false
        System.out.println("1.1 " +greaterThanTen.test(15));  // true
        
        // BiPredicate to check if the sum of two integers is even
        BiPredicate<Integer, Integer> isSumEven = (a, b) -> (a + b) % 2 == 0;
        
        // Test the BiPredicate with some values
        System.out.println("1.2 " +isSumEven.test(2, 3));    // false (2 + 3 = 5, which is odd)
        System.out.println("1.3 "+isSumEven.test(4, 6));    // true (4 + 6 = 10, which is even)
        
        // Another example: BiPredicate to check if one string is longer than another
        BiPredicate<String, String> isStr1Longer = (str1, str2) -> str1.length() > str2.length();
        
        // Test the BiPredicate with some strings
        System.out.println("1.4 "+isStr1Longer.test("hello", "world"));   // false ("hello" is not longer than "world")
        System.out.println("1.5 "+isStr1Longer.test("java", "programming"));   // true ("programming" is longer than "java")
       
 /********************************************************************************************************************************************/
 
        // Function to square a number
        Function<Integer, Integer> squareFunction = num -> num * num;
        
        // Apply the function
        System.out.println("2.1 "+squareFunction.apply(5));   // 25
        System.out.println("2.2 "+squareFunction.apply(10));  // 100
        
        // Function to double the input
        Function<Integer, Integer> doubleFunction = num -> num * 2;
        
        // Function to add 10 to the input
        Function<Integer, Integer> addTenFunction = num -> num + 10;
        
        // Function chaining: double the input first, then add 10
        Function<Integer, Integer> doubleAndAddTen = doubleFunction.andThen(addTenFunction);
        
        // Apply the chained function to a number
        int result = doubleAndAddTen.apply(5);
        
        System.out.println("Result: " + result); // Result: (5 * 2) + 10 = 20
     // BiFunction to concatenate two strings
        BiFunction<String, String, String> concatenateFunction = (str1, str2) -> str1 + " " + str2;
        
        // Use the BiFunction with some strings
        String concatenatedString = concatenateFunction.apply("Hello", "world");
        System.out.println("Concatenated String: " + concatenatedString);
        
        // BiFunction to calculate the sum of two integers
        BiFunction<Integer, Integer, Integer> sumFunction = (num1, num2) -> num1 + num2;
        
        // Use the BiFunction with some numbers
        int sum = sumFunction.apply(5, 10);
        System.out.println("Sum: " + sum);
  
 /**********************************************************************************************************************************************/
    
        // Consumer to print a message
        Consumer<String> messageConsumer = message -> System.out.println("Message: " + message);
        
        // Consume the message
        messageConsumer.accept("Hello, world!");
        
        // BiConsumer to concatenate and print two strings
        BiConsumer<String, String> concatenateAndPrint = (str1, str2) -> {
            String concatenated = str1 + " " + str2;
            System.out.println("Concatenated String: " + concatenated);
        };
        
        // Use the BiConsumer with some strings
        concatenateAndPrint.accept("Hello", "world");
        concatenateAndPrint.accept("Java", "programming");
    
 /********************************************************************************************************************************************************/
        // Supplier to generate a random number
        Supplier<Double> randomNumberSupplier = () -> Math.random();
        System.out.println("Random Number: " + randomNumberSupplier);
        
        /*
         * Java program to generate OTP using Supplier interface
         */
        // Supplier to generate a 6-digit OTP
        Supplier<String> otpSupplier = () -> {
            StringBuilder otp = new StringBuilder();
            Random random = new Random();
            for (int i = 0; i < 6; i++) {
                otp.append(random.nextInt(10)); // Append a random digit (0-9)
            }
            return otp.toString();
        };
        
        // Generate and print the OTP
        String otp = otpSupplier.get();
        System.out.println("Generated OTP: " + otp);
        
        // Get a random number
        double randomNum = randomNumberSupplier.get();
        System.out.println("Random Number: " + randomNum);
    
    }
	

}
