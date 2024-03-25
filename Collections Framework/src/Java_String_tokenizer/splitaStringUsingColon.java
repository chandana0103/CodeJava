package Java_String_tokenizer;

import java.util.StringTokenizer;

//java program to split a String using colon as delimiter

public class splitaStringUsingColon {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		String a=":";
		String b="hi :hello :java:.:welcome:now";
		
		StringTokenizer s=new 	StringTokenizer(b,a);

		System.out.println(s);
		int count=s.countTokens();
		System.out.println(count);
		
		for(int i=0;i<count;i++) {
			System.out.println("token["+i+"]:"+s.nextToken());
		}
		
		StringTokenizer s1=null;
		while(s.hasMoreTokens()) {
			System.out.println(s1.nextToken());
		}
	}

}
