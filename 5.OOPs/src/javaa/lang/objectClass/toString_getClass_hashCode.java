package javaa.lang.objectClass;
/*String toString()
	This method used to represent the object in the form of string. 
	when we display any object it will call toString() method automatically whether we specify or not
Class getClass():
	This method returns the object in the form of Class using which we can get the information 
	of particular class like class name, belongs what package,.....
int hashCode()
-> This method returns hashcode of the particular object .
-> Hashcode is a unique identification number which holds address of the corresponding object.

*/
public class toString_getClass_hashCode {

	public static void main(String[] args) {

		student1 s=new student1(1,"chandu");
		student1 s2=new student1(3,"chotu");
		student1 s3=new student1(4,"chintu");

	//System.out.println(s);	
	System.out.println(s.toString());
	System.out.println(s.getClass().getName());	
	System.out.println(s.hashCode());

	System.out.println(s3.toString());	

	}
}
class student1 {
	String name;
	int count=0;int n;
	

	public student1(int n, String name) {
		// TODO Auto-generated constructor stub
	}
	public String toString() {
		
		return "student[n:" +n+ ",name: "+name+"]";		
	}
	public int hashCode() {
		return count++;
		
	}
}
