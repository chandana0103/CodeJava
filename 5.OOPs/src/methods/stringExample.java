package methods;

import java.util.Arrays;

public class stringExample {
	
	
	String fullName(String s1,String s2) {	//Method with String return type & String parameters
		String fname=s1+s2;
		return fname;	
	}
	
	void print(int[] arr) {				//Method with array as parameter & without return type
		System.out.println(Arrays.toString(arr));
	}
	
	boolean check(int age) {		//Method with int as parameter & boolean return type
		if(age>=18) {
			return true;
		}else {
			return false;
		}
	}
	void info(student st) {		//Method with Object as parameter & without return type
		System.out.println("ID:"+st.no);
		System.out.println("name:"+st.name);
	}
	
	student getInfo() {	//Method with Object as return type & without parameter
		student s1=new student();
		s1.no=2332;
		s1.name="sdsda";
		return s1;
	}
	public static void main(String[] args) {
		stringExample result=new stringExample();	//object creation
		student st=new student();
		st.no=2321;
		st.name="chandana";
		
		System.out.println(result.fullName("chandana"," potllaplli"));
		int[] arr = {25,32,43,32};
		result.print(arr);
		System.out.println("elgible: "+result.check(34));
		result.info(st);
		
		student s=result.getInfo();
		System.out.println("ID:"+s.no);
		System.out.println("name:"+s.name);
		
	}

}
class student{		//student class with no and name
	int no;
	String name;
}
