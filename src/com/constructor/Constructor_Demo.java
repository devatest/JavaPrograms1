package com.constructor;

public class Constructor_Demo
{
	 static 
	 {     
		System.out.println("Good Morning");
	 } 
	 
	public static void main(String[] args) 
	{
		                                                        // ""    {     }    ()
		Constructor_Demo con = new Constructor_Demo();
		con.add();
	}
	
	 void add ()
	 {     
		System.out.println("Very Good Morning");
	 }

	
	Constructor_Demo()
	 {     
		System.out.println("Constructor ");
	 } 
	
	 {     
		 System.out.println("Morning");
	 }  

}
