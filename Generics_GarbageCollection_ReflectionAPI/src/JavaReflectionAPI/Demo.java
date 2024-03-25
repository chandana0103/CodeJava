package JavaReflectionAPI;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

/*
 * Reflection means ability of a software to analyse itself. 
 * In Java, Reflection API provides facility to analyse and change runtime behaviour of a class at runtime.
 *
 */

//java program to get Class object
class A{
	int no;
	String name;
	
	private int empId;
	
}
public class Demo {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		A obj=new A();
		Class name=obj.getClass();
		System.out.println(name);
		name="hello".getClass();
		System.out.println(name);
	
		/*
		 * Class.forName ( )
		 * -> Class is a predefined class available in java.lang package.
		 */
		
		//A class
		Class name1=Class.forName("JavaReflectionAPI.A");
		
		System.out.println(name1);
		
		//creating object
		Object instance=name.newInstance();
		A a=(A) instance;
		System.out.println(a);
		//string class
		name1=Class.forName("java.lang.String");
		System.out.println(name1);
		
	// Java program to access private variable outside the class using Reflection
		
		
		//accessing ptivate variable in other class
		Field f=name1.getDeclaredField("empId");
		f.setAccessible(true);
		f.set(a,10);
		System.out.println(f.get(a));
		
    //Java program to get Variables of class using Reflection
		//get feilds metadata
		Field[] f1=name1.getDeclaredFields();
		for(Field f2:f1) {
			System.out.println(f2.getType()+" ");
			System.out.println(f2.getName());
			System.out.println(f2.getModifiers());
		}
		
		//java program to get methods metadata using Reflection
		//get methods metadata
		Method[] met=name1.getDeclaredMethods();
		for(Method m:met) {
			System.out.println(m);
			System.out.println(m.getDefaultValue());
			System.out.println(m.getModifiers());
			System.out.println(m.getName());
			System.out.println(m.getParameterCount());
			System.out.println(m.getReturnType());


			
		}
	}

}














