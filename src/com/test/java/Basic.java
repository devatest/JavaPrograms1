package com.test.java;

public class Basic {

	public static void main(String[] args) 
	{
		System.out.println("Basic Addition ");
		Basic ref = new Basic();
		int d = ref.add(50, 20);
        System.out.println(d);
		
//		int a=10,b=20;
//		int c=a+b;
//		System.out.println(a+b);
		
	}
	
	public int add(int x,int y)
	{
		int c = x + y;
		return c;
	}

}


// MethodOverLoading is depends upon method name & method arguments.
// methodName(int A,String B)