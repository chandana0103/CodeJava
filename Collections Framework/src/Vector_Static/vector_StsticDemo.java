package Vector_Static;

import java.util.Stack;
import java.util.Vector;

/*
 * Vector is the implementation class of List interface which is also used to store group of individual objects where duplicate values are allowed
 * Vector is exactly similar to ArrayList but ArrayList is not a synchronized class where Vector is a synchronized class
 * Vector is also called legacy class because it is available from java 1.0 version.
 * 
 * Stack is a child class of Vector and implements List interface
 * Stack stores a group of objects b using a mechanism called LIFO
 * LIFO stands for Last in first out , it means last inserted element deleted first.
 *   methods:E push(E obj) : this method will add new element into the Stack
 *     E pop() : this method deletes the top element available on Stack
 *     E peek() : this method just returns the top element available on Stack
 */

public class vector_StsticDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Vector<String> v=new Vector<String>();
		Stack<Double> s=new Stack<Double>();
		
		//Vector v1=new Vector();
		v.add("chandu");
		v.add("chandana");
		v.add("nikki");
		System.out.println(v);
		
		v.add(new String("hello"));
		System.out.println(v);
		System.out.println(v.size());


		s.push(232.13);
		s.push(3121.113123);
		s.push(223113.1);
		s.push(24.133);

		System.out.println(s);
		System.out.println(s.pop());//Removes the object at the top of this stack and returns thatobject as the value of this function
		System.out.println(s);
		System.out.println(s.peek());//Looks at the object at the top of this stack without removing itfrom the stack
		System.out.println(s);

	}

}
