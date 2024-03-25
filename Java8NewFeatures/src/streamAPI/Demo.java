package streamAPI;
/*
 * A stream in java can be defined as a sequence of elements 
 * from a source that supports aggregate operations on them.
 */
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Demo {
	
	public static void main(String args[]) {
		
		Stream<Integer> sm1=Stream.of(1,2,3,4,5,6);
		
		List<String> l=new ArrayList<>();
		l.add("hello");
		l.add("hi");
		l.add("where");
		l.add("now");
		
		Stream<String> sm2=l.stream();
		System.out.println(sm2);
		

	}

}
