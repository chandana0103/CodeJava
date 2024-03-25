package otherJava8;

import java.util.Optional;
/*
 * Optional class help in writing a neat code without using too many null checks.
 *  By using Optional, we can specify alternate values to return or alternate code to run.
 *  This makes the code more readable.
 */
public class OptionClassDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		String[] str1=new String[10];
//		String str=str1[5].toLowerCase();
//		System.out.println(str);		//will be throwing null pointer excption
		
		
		String[] str2=new String[10];
		Optional<String> checkNull=Optional.ofNullable(str2[5]);
		if(checkNull.isPresent()) {
			String res=str2[5].toLowerCase();
			System.out.println(res);
		}else
			System.out.println("no word its null");
		
	}
}
