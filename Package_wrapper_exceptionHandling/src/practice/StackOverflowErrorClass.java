package practice;
/*
 * StackOverflowError is an error which Java doesn’t allow to catch, 
 * for instance, stack running out of space, as it’s one of the most common runtime errors one can encounter.
 */
public class StackOverflowErrorClass {

	    static int i = 0; 
	  
	    // Method to print numbers 
	    public static int printNumber(int x)    { 
	        i = i + 2; 
	        
	        // to overcome runtime stackoverflow error
	        if (i == 10) 
            return i;
	        
	        System.out.println(i); 
	        return i + printNumber(i + 2); 
	    } 
	  
	    public static void main(String[] args)   { 
	        // Recursive call without any 
	        // terminating condition 
	        StackOverflowErrorClass.printNumber(i); 
	}

}
