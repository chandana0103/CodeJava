package SetCategory;

import java.util.HashSet;
import java.util.Iterator;



/*
 * HashSet is the implementation class of Set interface which is also used to store group of individual objects but duplicate values are not allowed
 * HashSet internally follows hashtable structure where all the elements are stored using hashing technique which will improve the performance by reducing the waiting time.
 */
public class HashSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashSet<String> h=new HashSet<String>();
		HashSet<Integer> hs=new HashSet<Integer>();

		h.add("abe");
		h.add("abe");
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
			
			System.out.println(it.next());
		}
	}

}
