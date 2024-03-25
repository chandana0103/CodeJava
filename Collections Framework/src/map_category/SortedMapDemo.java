package map_category;
/*
 * It is the child interface of Map.
 * If we want to represent a group of key-value pairs according to some sorting order of keys then we should go for SortedMap.
 * Sorting is possible only based on the keys
 */
import java.util.Collection;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

public class SortedMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SortedMap<Integer,String> hm=new TreeMap<Integer,String>();

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
