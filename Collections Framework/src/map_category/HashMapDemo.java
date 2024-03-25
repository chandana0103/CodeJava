package map_category;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

/*
 *  HashMap is the implementation class of Map interface which is used to store group of objects in the form of Key-Value pairs where but Keys cannot be duplicated but values can be duplicated
 *  HashMap is called unordered Map because it is not guarantee for insertion order of elements.
 *  HashMap<K,V> hm = new HashMap<K,V>();
 */
public class HashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<Integer,String> hm=new HashMap<Integer,String>();

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

		HashMap h=new HashMap();
		Integer i1=new Integer(10);
		Integer i2=new Integer(10);
		h.put(i1,"John");
		h.put(i2,"Smith");
		System.out.println(h);//{10=Smith}



	}

}
