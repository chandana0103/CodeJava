package Strings;
public class count_num_words { 
    public static void main(String[] args) {  
        String s = "my name is chandana";  
        int wordCount = 0;  
          
        for(int i = 0; i < s.length()-1; i++) {  
            //Counts all the spaces present in the string  
            //It doesn't include the first space as it won't be considered as a word  
            if(s.charAt(i) == ' ' && Character.isLetter(s.charAt(i+1)) && (i > 0)) {  
                wordCount++;  
            }  
        }  
        //To count the last word present in the string, increment wordCount by 1  
        wordCount++;  
          
        //Displays the total number of words present in the given string  
        System.out.println("Total number of words in the given string: " + wordCount);  
        
        
        String st="java";
        int n =4,count =0;
        while( n !=0) {
        n=n/10; count++;}
        System.out.println(count);
        if(count<2) {
        
        	System.out.println(st.concat("0"+n));
        }else {
        	System.out.println(st+"   "+n);
        }
    
    } 
    
    
}  

