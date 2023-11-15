package TypeCasting;
/*
 * Type casting wrt primitive data types:
 * converting the value from lower data type into higher data type is called widening.
    syntax:	higher datatype = (higher datatype) lower datatype ;		
 * narrowing means converting the higher data type value into smaller data type.
	syntax:	lowerdatatype = (lowerdatatype) higherdatatype; 	
*/
public class Widening_Narrowing {

	public static void main(String[] args) {

		int a=43;
		System.out.println("integer:"+a);
		double d=a;				//coverting int to double
		System.out.println("doouble:"+d);

		
		double x=123.563;
		System.out.println("double value:"+x);
		int y=(int )x;			//coverting double to int
		System.out.println("integer:"+y);

	}

}
