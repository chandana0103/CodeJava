package otherJava8;
/*
 * Using this class we can join more than one strings with the specified delimiter, 
 * we can also provide prefix and suffix to the final string while joining multiple strings.
 *
 */
import java.util.StringJoiner;

public class StringJoinerDemo {

	public static void main(String args[]) {
		
		
		//StringJoiner sj=new StringJoiner("-");	//passing -delimiter
		
		StringJoiner sj=new StringJoiner("-","(",")");
		
		sj.add("anu");			//joining multiple strings
		sj.add("hello");
		sj.add("where");
		
		System.out.println(sj);
	}
}
