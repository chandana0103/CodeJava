package String;

//StringBuilder is identical to StringBuffer except for one important difference that it is not synchronized, which means it is not thread safe.
public class String_builder {

	public static void main(String[] args) {
		
		StringBuilder sbr=new StringBuilder("Chandana");
		
		sbr.append("Potllapalli");//will concatenate the string representation of any type of data to the end of the StringBuffer object
		System.out.println(sbr);

	}

}
