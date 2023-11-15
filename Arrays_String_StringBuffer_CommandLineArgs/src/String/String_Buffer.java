package String;
//It is similar to String class in Java both are used to create string, but stringbuffer object can be changed.

public class String_Buffer {

	public static void main(String[] args) {
		
		StringBuffer sb=new StringBuffer("Chandana");
		System.out.println(sb.append("Potlapalli"));
		
		String str="Potllapalli";
		System.out.println(str.concat("Potlapalli"));

		

	}

}
