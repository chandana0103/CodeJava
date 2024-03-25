package map_category;

/*
 * LinkedHashMap is the implementation class of Map interface which is also used to store group of3 objects in the form of Key-Value pairs where Keys can't be duplicated but values can be duplicated
 * LinkedHashMap is called as ordered Map because it is guarantee for insertion order of elements.

 */
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Set;

public class LinkedHashMapDemo {

	public static void main(String[] args) {

		LinkedHashMap<Integer,String> hm=new LinkedHashMap<Integer,String>();

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
