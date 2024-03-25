package LamdaExpressions;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionDemo {

	public static void main(String[] args) {

		ArrayList<Integer> a=new ArrayList<Integer>();
		a.add(101);
		a.add(104);
		a.add(103);
		a.add(102);
		System.out.println("before sorting "+a);
		
		//using lambda expressions 
		
		Collections.sort(a,(a1,a2)->(a1>a2)?-1:(a1<a2)?1:0);
		System.out.println("after sorting-- decending order "+a);
		
		Collections.sort(a,(a1,a2)->(a1<a2)?-1:(a1>a2)?1:0);
		System.out.println("after sorting --asending order "+a);
	}
}
