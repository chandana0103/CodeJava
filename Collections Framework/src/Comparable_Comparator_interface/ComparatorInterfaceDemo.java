package Comparable_Comparator_interface;

import java.util.Collection;
import java.util.Comparator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeSet;

/*
 * Comparator interface present in java.util package. It defines the
 * following two methods.
 * 1) public int compare(Object o1,Object o2);
 * 2) public boolen equals(Object o);
 * Whenever we are implementing comparator interface we have to provide implementation only for compare() method.
 * 
 */
public class ComparatorInterfaceDemo {
/*
 * Write a program to insert integer Objects into the TreeSet where the
sorting order is descending order
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeSet ts=new TreeSet(new MyComparator());
		ts.add(10);
		ts.add(0);
		ts.add(15);
		ts.add(5);
		ts.add(20);
		System.out.println(ts);//[20, 15, 10, 5, 0]
		}
}
	class MyComparator implements ComparatorInterfaceDemo, NavigableMap {
		public int compare(Object o1,Object o2) {
		Integer i1=(Integer)o1;
		Integer i2=(Integer)o2;
		if(i1<i2)
		return 1;
		else if(i1>i2)
		return -1;
		else
		return 0;
		}

		@Override
		public Comparator comparator() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public Object firstKey() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public Object lastKey() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public Set keySet() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public Collection values() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public Set entrySet() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public int size() {
			// TODO Auto-generated method stub
			return 0;
		}

		@Override
		public boolean isEmpty() {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public boolean containsKey(Object key) {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public boolean containsValue(Object value) {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public Object get(Object key) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public Object put(Object key, Object value) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public Object remove(Object key) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public void putAll(Map m) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void clear() {
			// TODO Auto-generated method stub
			
		}

		@Override
		public Entry lowerEntry(Object key) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public Object lowerKey(Object key) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public Entry floorEntry(Object key) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public Object floorKey(Object key) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public Entry ceilingEntry(Object key) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public Object ceilingKey(Object key) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public Entry higherEntry(Object key) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public Object higherKey(Object key) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public Entry firstEntry() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public Entry lastEntry() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public Entry pollFirstEntry() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public Entry pollLastEntry() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public NavigableMap descendingMap() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public NavigableSet navigableKeySet() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public NavigableSet descendingKeySet() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public NavigableMap subMap(Object fromKey, boolean fromInclusive, Object toKey, boolean toInclusive) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public NavigableMap headMap(Object toKey, boolean inclusive) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public NavigableMap tailMap(Object fromKey, boolean inclusive) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public SortedMap subMap(Object fromKey, Object toKey) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public SortedMap headMap(Object toKey) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public SortedMap tailMap(Object fromKey) {
			// TODO Auto-generated method stub
			return null;
		}
	

}
