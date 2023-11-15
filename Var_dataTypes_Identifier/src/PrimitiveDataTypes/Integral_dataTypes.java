package PrimitiveDataTypes;

/*
 variables are used to store the data during program execution
 To specify type of data we will use 'data types'
 Name used for classes, methods, interfaces and variables are called Identifier
*/

public class Integral_dataTypes {

	public static void main(String[] args) {

		byte  b=127;        // byte =8 bits  (-128 to 127)
		short s=32767;      // short=2 bytes (-32768 to 32767)
		int   i=20;         // int  =4 bytes (-2^31  to 2^31-1)
		long  l=32423424;   // long =8 bytes (-2^63 to 2^63-1)
		
		int fee;            // variable declaration
		fee=326352;         // variable initialization
		
		System.out.println(l+ " " +i+ " " +s+ " " +b);
        System.out.println(fee);
	}

}
