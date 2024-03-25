package WrapperClasses;
/*
 * valueOf() : : This methd is also used to convert the primitive value into object(boxing)
syntax1: public static WrapperClass valueOf(primitive)
-> This method is available in all the 8 wrapper classes.
syntax2: public static WrapperClass valueOf(String)
-> This method is available in all the wrapper classes except Character class.
 */
public class boxing_unboxing {

	public static void main(String[] args) {

		int a=34;
		
		Integer x=new Integer(a);//boxing using constructor
		Integer y=Integer.valueOf(a);//boxing using valueOf()
		System.out.println(x);
		System.out.println(y);
	/*
	 * Boxing: converting a primitive value into object is called boxing. 
	 * from java 1.5 onwards this procedure is done automatically by compiler hence it is called auto boxing.
	 * 
	 * Unboxing: converting an object value into primitive type is called un boxing. 
	 * from java 1.5 onwards this procedure is automatically done by compiler hence it is called auto un boxing	
	 * 
	 * Parsing: parsing is a process of converting String into corresponding primitive type
	 */
		Integer i=Integer.valueOf(a);//boxing
		int v=i.intValue();//unboxing
		byte b=i.byteValue();//unboxing
	
		System.out.println(v);
		System.out.println(b);
		
		String str="30";
		int a2=Integer.parseInt(str);//parsing
		System.out.println(a2);
		
		Integer p,q;
		p=new Integer(10);//manual boxing
		p=23;//auto boxing
		q=323;//auto boxing
		
		int r=p.intValue()+q.intValue();//manual unboxing
		int s=p+q;//auto boxing
		System.out.println(s);

	}

}
