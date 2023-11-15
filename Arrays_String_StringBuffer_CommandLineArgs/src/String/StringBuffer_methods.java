package String;

/*
 * StringBuffer class is used to create a mutable string object. It means, it can be changed after it is created.
It is also thread safe i.e multiple threads cannot access it simultaneously.
 */
public class StringBuffer_methods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StringBuffer sb=new StringBuffer("Chandana");
		
		sb.append(" Potllapalli");//will concatenate the string representation of any type of data to the end of the StringBuffer object
		System.out.println(sb);
		System.out.println(sb.insert(2,798));//inserts one string into another
		System.out.println(sb.reverse());//reverses the characters within a StringBuffer object.
		System.out.println(sb.replace(2, 4, "ok"));//replaces the string from specified start index to the end index.
		System.out.println(sb.capacity());//returns the current capacity of StringBuffer object.

	}

}
