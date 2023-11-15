package String;

public class String_Manipulations {

	public static void main(String[] args) {
		
		String s1="Chandana";
		String s2="Potllapalli";
		
		System.out.println("length of strings:"+s1.length()+" "+s2.length());//number of characters that a given string contains
		System.out.println("Full name: "+s1.concat(" "+s2));
		System.out.println(s1.toCharArray());//This method is used to convert all the characters of a string into a Character Array
		System.out.println(s1.charAt(4));//is used to retrieve a single character from a given String.
		System.out.println(s1.compareTo(s2));//is used to compare two Strings.The comparison is based on alphabetical order.
		System.out.println(s2.contains("palli"));//This method is used to determine whether a substring is a part of the main String or not.
		
		String[] split=s1.split("d");
		for(String str:split) {
			System.out.println(str);//a split() method is used to split or separate the given String into multiple substrings separated by the delimiter
		}
		System.out.println(s1.indexOf("a")+" "+s1.lastIndexOf("a"));//is used to search for the first occurrence of the character.
									//lastIndexOf() is used to search for the last occurrence of the character.
		System.out.println(s1.toString());//This method returns the String equivalent of the object that invokes it.
		System.out.println(s2.replace("Potllapalli","chandu" ));//used to replace the character with the new characters in a String.
		System.out.println(s2.substring(0,5));//to return the substring of the main String by specifying the starting index and the last index of the substring.
	}

}
