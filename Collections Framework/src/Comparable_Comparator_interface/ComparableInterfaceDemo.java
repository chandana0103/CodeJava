package Comparable_Comparator_interface;

/*
 * Comparable interface present in java.lang package and 
 * contains only one method compareTo() method.
 * If we depend on default natural sorting order then internally JVM will use compareTo() method to arrange Objects in sorting order.
 */
public class ComparableInterfaceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("A".compareTo("Z"));
		System.out.println("e".compareTo("j"));

		System.out.println("z".compareTo("a"));

	}

}
