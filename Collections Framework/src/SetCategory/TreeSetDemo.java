package SetCategory;
/*
 * TreeSet is the implementation class of Set interface which is also used to store group of individual objects but duplicate values are not allowed
 * TreeSet is called as unordered Collection because it is not guarantee for insertion order of elements but all elements are stored in sorted order(bydefault ascending order)
 *
 * NULL acceptance:
 * For the empty TreeSet as the first element "null" insertion is possible but after inserting that null if we try to insert any other value then we will get NullPointerException.
 * 
 */
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeSet<String> h=new TreeSet<String>();
		TreeSet<Integer> hs=new TreeSet<Integer>();

		TreeSet t=new TreeSet();

		//t.add(null); invalid it thorws nullpointerexcpetion
	//	t.add("xasdc");throws class cast excpetion
		t.add(new StringBuffer("java"));
		t.add(new StringBuffer("core"));
		t.add(new StringBuffer("course"));

		System.out.println(t);
		
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
