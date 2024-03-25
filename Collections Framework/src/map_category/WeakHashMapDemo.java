package map_category;
/*
 * But in the case of WeakHashap if an Object does not have any references, 
 * then it is always eligible GC even though if it is associated with WeakHashMap that means GC dominates WeakHashMap.
 */
import java.util.WeakHashMap;

public class WeakHashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WeakHashMap<Person,String> w=new WeakHashMap<Person,String>();

		Person p=new Person();
		w.put(p,"hello");
		System.out.println(w);
		
		p=null;
		System.out.println(w);

	}
}

class Person{
	public String ToString() {
			return "temp";
			
		
	}
}
/*
 * In the above program if we replace WeakHashMap with normal HashMap 
 * then Object won't be destroyed by the garbage collector.
 */
