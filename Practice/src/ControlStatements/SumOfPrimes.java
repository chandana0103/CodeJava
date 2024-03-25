package ControlStatements;

public class SumOfPrimes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int count, sum = 0;  
		
		for(int number = 1; number <= 10; number++)  {  
		count = 0;  
		for (int i = 2; i <= number/2; i++)  {  
		if(number % i == 0)  {  
		count++;  
		break;  
		}    
		}  
		if(count == 0 && number != 1 )  
		{  
		sum = sum + number;  
		}   
		}   
		System.out.println("The Sum of Prime Numbers : " + sum);  
		} 
	

}
