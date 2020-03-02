package com.static_parent;

public class Fruits
{

	public static void main(String[] args)
	{
     
		Orange orng = new Orange();
		orng.printfruits();

	}

}


//We can use super keyword to access the data member or field of parent class.
//It is used if parent class and child class have same fields.

//Apple and orange both classes have a common property color.
//If we print color property, it will print the color of current class by default. 
//To access the parent property, we need to use super keyword.
