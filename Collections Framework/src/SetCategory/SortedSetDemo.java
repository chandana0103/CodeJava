package SetCategory;

import java.util.SortedSet;
import java.util.TreeSet;

/*
 * 1) It is child interface of Set
 * 2) If we want to represent a group of "unique Objects" according to some sorting order then we should go for SortedSet interface.
 * 3) That sorting order can be either default natural sorting order OR customized sorting order.
 */
public class SortedSetDemo{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SortedSet ss=(SortedSet) new TreeSet();
		for(int i=10;i<=20;i++)
		ss.add(i);
		System.out.println(ss.first());
		System.out.println(ss.last());
		System.out.println(ss.headSet(16));
		System.out.println(ss.tailSet(18));
		System.out.println(ss.subSet(12,17));
		System.out.println(ss.comparator());
	}

}
