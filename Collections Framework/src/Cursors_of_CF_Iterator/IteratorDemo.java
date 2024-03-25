package Cursors_of_CF_Iterator;
/*
 * Iterator:access the elements in forward direction only,applied Any Collection (List, Set)
 * while accessing the methods we can also delete the elements
 * Iterator is interface and we cannot create an object directly.
 * if we want to create an object for Iterator, we have to use iterator () method
 */
import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> a1=new ArrayList<String>();
		
		a1.add("name:chandu");
		a1.add("age:20");
		a1.add("loc:hyderabad");

		a1.add("chandana");
		a1.add("hello");
		a1.add("hi");
		Iterator<String> it = a1.iterator();		
		while(it.hasNext()) {
			String next=it.next();
			System.out.println(next);
		}
		
	}

}
