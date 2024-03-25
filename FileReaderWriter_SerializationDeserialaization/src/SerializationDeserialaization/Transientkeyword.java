package SerializationDeserialaization;
/*
 *  Let's consider a case where you are serializing an object 
 *  and want that a certain field of the object doesn't get serialized.
 * Ex: I don't want to serialize sensitive or secret data like my password, atm pin, ssn etc
 */
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Transientkeyword implements Serializable {

	//class Test implements Serializable 
	//{ 
	    // Normal variables 
	    int i = 10, j = 20; 
	  
	    // Transient variables 
	    transient int k = 30; 
	  
	    // Use of transient has no impact here 
	    transient static int l = 40; 
	    transient final int m = 50; 
	  
	    public static void main(String[] args) throws Exception 
	    { 
	        Test input = new Test(); 
	  
	        // serialization 
	        FileOutputStream fos = new FileOutputStream("abc.txt"); 
	        ObjectOutputStream oos = new ObjectOutputStream(fos); 
	        oos.writeObject(input); 
	  
	        // de-serialization 
	        FileInputStream fis = new FileInputStream("abc.txt"); 
	        ObjectInputStream ois = new ObjectInputStream(fis); 
	        Transientkeyword output = (Transientkeyword)ois.readObject(); 
	        System.out.println("i = " + output.i); 
	        System.out.println("j = " + output.j); 
	        System.out.println("k = " + output.k); 
	        System.out.println("l = " + output.l);   
	        System.out.println("m = " + output.m); 
	    }  
}
