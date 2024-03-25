package map_category;

import java.util.Enumeration;
import java.util.Hashtable;

/*
 * Hashtable is the implementation class of Map interface which is also used to store group of objects in the form of Key-Value pairs where Keys can't be duplicated but values can be duplicated
 * Hashtable is exactly similar to HasMap but Hashtable is a synchronized class where HashMap is not a synchronized class
 * Hashtable does not support null values for both Keys and Values
 */
public class HashtableDemo {

	public static void main(String[] args) {
		
		Hashtable<String,Integer> ht=new Hashtable<String,Integer>();
		
		ht.put("hello",32);
		ht.put("java",192);
		ht.put("welcome",829);
		ht.put("world",2192);
		ht.put("hello",32);

		ht.put("Hello",32);

		System.out.println(ht);
		Enumeration e=ht.keys();
		while(e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}
			
		
	}
}
