package com.staticvariable;

public class Static_Variabl 
{
	int rollno;                                                       // ""    {     }    ()
	String name;
	static String college = "MIT";      //common property
	
	Static_Variabl(int r, String n)
	{     
	 rollno = r;
	 name = n;
	}
	
	void display()
	{     
	 System.out.println(rollno+" "+name+" "+college );
	}

	public static void main(String[] args) 
	{
		Static_Variabl v1 = new Static_Variabl(111,"Dev");
		Static_Variabl v2 = new Static_Variabl(222,"Deva");
		
		v1.display();
		v2.display();
		

	}

}
