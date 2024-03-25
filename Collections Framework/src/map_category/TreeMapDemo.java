package map_category;

import java.util.Collection;
import java.util.Set;
import java.util.TreeMap;

/*
 * TreeMap is the implementation class of Map interface which is also used to store group of objects in the form of Key-Value pairs where Keys can't be duplicated but values can be duplicated
 * TreeMap is called as unordered Map because it is not guarantee for insertion order of elements, but. all elements are
 * 
 */
public class TreeMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeMap<Integer,String> hm=new TreeMap<Integer,String>();

		hm.put(101,"chandu");
		hm.put(103,"chandu");
		hm.put(102,"chandana");
		hm.put(101,"chandu");

		System.out.println(hm);
		System.out.println(hm.size());
		
		Set<Integer> i=  hm.keySet();
		System.out.println(i);

		Collection<String> c=hm.values();
		System.out.println(c);
		
		Set<?> s=hm.entrySet();
		System.out.println(s);
		
		System.out.println(hm.containsKey(103));

		System.out.println(hm);


	}

}
