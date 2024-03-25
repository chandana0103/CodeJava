package GarbageCollection;

/*
 * We can also use the System.gc() method which is common.
The “gc()” method allows us to call the garbage collector method

-> The garbage collector in Java is solely responsible for deleting un-used / un-referenced objects.
 */
public class Demo {

	Demo d;

	public static void main(String[] args) {
	
		Demo obj1=new Demo();
		System.out.println("demo obj1 created");
		
		Demo obj2=new Demo();
		System.out.println("demo obj2 created");
		
		obj1.d=obj2;
		obj2.d=obj1;

		obj1=null;
		obj2=null;
		System.gc();
	}
	
	protected void finalize() throws Throwable{
		System.out.println(" finalize method called");
		
		
	}
}
