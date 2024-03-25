package Generics;

/*
 * Before Generics was introduced, generalized classes, interfaces or methods were created using references of type Object 
 * because Object is the super class of all classes in Java, but this way of programming did not ensure type safety.
 *
 */

class Gen<T> {
	T obj; //an object of type T is declared
	
	Gen(T o){	//constructor
		
		obj=o;
	}
	public T getObj() {
		return obj;
	}
}
public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Gen<Integer> iob=new Gen<>(100);	//instance of integer type Gen class
		int x=iob.getObj();
		System.out.println(x);
		Gen<String> sob=new Gen<>("hello");	//instance of String type Gen class
		String str=sob.getObj();
		System.out.println(str);

	}


}
/*
 * 
 * In the above program, we first passed an Integer type parameter to the Generic class.
 * Then, we passed a String type parameter to the same Generic class. 
 * Hence, we reused the same class for two different data types. 
 * Thus, Generics helps in code reusability with ease.
 */
