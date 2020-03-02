package com.fibonacci;

public class Fibonacci
{

	public static void main(String[] args)
	{
//		int c = 15;
//        int[] a = new int[c];
//        a[0] = 0;
//        a[1] = 1;
//        for(int i=2; i < c; i++)
//        {
//            a[i] = a[i-1] + a[i-2];
//        }
//
//        for(int i=0; i< c; i++)
//        {
//             System.out.print(a[i] + " ");
//        }
		
		int num=15;
		int a=0,b=1;
		System.out.println(a);
		System.out.println(b);
		for (int i=2; i<=num; i++) 
		{
			int c=a+b;
			System.out.println(c);
			a=b;
			b=c;
			
			
			
		}

	}

}
