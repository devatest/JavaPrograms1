package com.fibonacci;

public class PrimeNo2
{

	public static void main(String[] args)
	{
     int num = 10;
     
     for (int i = 2; i <=num; i++)
     {
		
	
     if (num%i==0)
     {
    	 System.out.println("It is not prime no");
    	 
    	 break;
		
	}
     else
     {
    	 System.out.println("Prime");
    	 
    	 break;
     }
     
     }

	}

}
//chromedriver is a class that is implimenting webdriver