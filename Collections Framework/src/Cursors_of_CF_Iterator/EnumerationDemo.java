package Cursors_of_CF_Iterator;
/*
 *  access the elements of Collection only in forward direction
 *  this is legacy cursor can be applied only for legacy classes like Vector,Stack,Hashtable.
 *  Enumeration is also an interface and we can not create object directly.
 *  If we want to create an object for Enumeration we have to use a legacy method called elements() method
 */

import java.util.Enumeration;
import java.util.Vector;

public class EnumerationDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Vector<Integer> v=new Vector<Integer>();
		v.add(732);
		v.add(45);
		v.add(98);
		v.add(91);
		System.out.println(v);
		
		Enumeration e= v.elements();
		while(e.hasMoreElements()) {
			System.out.println(e.nextElement()+" ");
		}
		
	}

}
