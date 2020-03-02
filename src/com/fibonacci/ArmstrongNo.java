package com.fibonacci;

public class ArmstrongNo 
{

	public static void main(String[] args) 
	{
     int a,c=0,temp;
     int n=153;    //To check the given no armstrong or not.
     temp=n;
     while(n>0)
     {
    	 a=n%10;
    	 n=n/10;
    	 c=c+(a*a*a);
    	 
     }
     if(temp==c)
     {
    	 System.out.println("It is a Armstrong No");
     }
     else 
     {
    	 System.out.println("It is not a Armstrong No");
     }

	}

}
