package Cursors_of_CF_Iterator;
/*
 * access the elements of Collection in both forward and backward directions
 *  This cursor can be applied only for List category Collections
 *  While accessing the methods we can also add,set,delete elements
 *  ListIterator is interface and we can not create object directly.
 *  If we want to create an object for ListIterator we have to use listIterator() method
creation of
 */
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ListIteratorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> a=new ArrayList<>();
		
		a.add("name:chandu");
		a.add("age:20");
		a.add("loc:hyderabad");

		a.add("chandana");
		a.add("hi");
		a.add("hello");
		a.add("where");

		ListIterator<String> lit = a.listIterator();		
		while(lit.hasNext()) {
			String next=lit.next();
			System.out.println(next);
		}
	}

}
