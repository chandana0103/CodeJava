package streamAPI;
/*
 * Parallel Streams
-> Streams is one of the major change added in java 1.8 version
-> Generally Streams will execute in Sequential manner
-> We can use parallel streams also to execute program faster by utilizing system resources efficiently.
-> Parallel Streams introduced to improve performance of the program.
 */
import java.util.Arrays;
import java.util.stream.Stream;

public class ParallelStreamsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 // Create an array of numbers
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        // Sequential stream example
        long startTimeSequential = System.currentTimeMillis();
        double sumSequential = Arrays.stream(numbers)
                                    .mapToDouble(i -> i * i)
                                    .sum();
        long endTimeSequential = System.currentTimeMillis();
        System.out.println("Sequential Stream Result: " + sumSequential);
        System.out.println("Sequential Stream Time: " + (endTimeSequential - startTimeSequential) + " milliseconds");

        // Parallel stream example
        long startTimeParallel = System.currentTimeMillis();
        double sumParallel = Arrays.stream(numbers)
                                  .parallel() // Convert the stream to a parallel stream
                                  .mapToDouble(i -> i * i)
                                  .sum();
        long endTimeParallel = System.currentTimeMillis();
        System.out.println("Parallel Stream Result: " + sumParallel);
        System.out.println("Parallel Stream Time: " + (endTimeParallel - startTimeParallel) + " milliseconds");
    
	
	System.out.println("serial number");
	Stream<Integer> s1=Stream.of(1,2,3,4,5,6);
	s1.forEach(num->System.out.println(num+":::"+Thread.currentThread().getName()));
	
	System.out.println("parallel number");
	Stream<Integer> s2=Stream.of(1,2,3,4,5,6);
	s2.parallel().forEach(num->System.out.println(num+":::"+Thread.currentThread().getName()));
	}
}
	
