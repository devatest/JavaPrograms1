package com.test.java;

public class InterfaceMain implements Interface1
{

	@Override
	public void method2() 
	{
	  System.out.println("TestA");
		
	}

	@Override
	public void method() 
	{
	  System.out.println("TestB");
		
	}
	public static void main(String[] args) 
	{
		InterfaceMain ref = new InterfaceMain();
		ref.method();
		ref.method2();
	}

}
