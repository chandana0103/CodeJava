package SetCategory;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

/*
 * LinkedHashSet is the implementation class of Set interface which is also used to store group of individual objects but duplicate values are not allowed
 * LinkedHashSet internally follows hashtable + doubly linked list structures
 * LinkedHashSet is called as ordered Collection because it is guarantee for insertion order of elements
 */
public class LinkedHashSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedHashSet<String> h=new LinkedHashSet<String>();
		LinkedHashSet<Integer> hs=new LinkedHashSet<Integer>();

		h.add("chandu");
		h.add("chandu");
		h.add("7dsc");
		hs.add(31);
		hs.add(13);
		System.out.println(h+" "+hs);
		System.out.println(h.size()+" "+hs.size());
		
		for(String s:h) {
			System.out.println(s);
		}

		for(Integer e:hs) {
			System.out.println(e);
		}

		Iterator it=hs.iterator();
		while(it.hasNext()) {
			
	}
	}

}
