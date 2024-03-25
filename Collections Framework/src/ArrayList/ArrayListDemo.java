package ArrayList;

import java.util.ArrayList;
/*
 * ArrayList is an implementation class of Collection interface.
 * The underlying data structure is resizable (Internally it will use Array to store data)
 * Duplicate Objects are allowed. Insertion order is preserved
 * Heterogeneous Objects are allowed.Null insertion is possible
 */

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList a=new ArrayList();
		a.add("name:chandu");
		a.add("age:20");
		a.add("loc:hyderabad");
		a.add(213213);
		System.out.println(a);
		
		a.remove(1);
		System.out.println(a);
		
		a.add(991882938);
		System.out.println(a);

	}

}
