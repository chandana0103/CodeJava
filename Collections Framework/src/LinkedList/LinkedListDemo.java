package LinkedList;

import java.util.LinkedList;
/*
 * If our frequent operation is insertion or deletion in the middle then LinkedList is the best choice
 * If our frequent operation is retrieval then LinkedList is not best option
 * Duplicate Objects are allowed.Insertion order is preserved
 */

public class LinkedListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList l=new LinkedList();
		
		l.add("name:chandu");
		l.add("age:20");
		l.add("loc:hyderabad");
		l.add(213213);
		System.out.println(l);
		
		l.remove(1);
		l.removeLast();
		l.add(null);
		System.out.println(l);
		
		l.addFirst(101);
		l.add(0,991882938);
		System.out.println(l);

		System.out.println(l.size());

	}

}
