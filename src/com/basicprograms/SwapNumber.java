package com.basicprograms;

import java.util.Scanner;

public class SwapNumber
{

	public static void main(String[] args)
	{
      int a;
      String s;
      
      Scanner in = new Scanner(System.in);
      System.out.println("Devidas");
      s = in.nextLine();
      System.out.println("My String is " +s);

	}

}



//-----Duplicate number---------- 16:30 
//public static void main(String[] args) {
//
//  int [] arr = {10,20,30,10,40,55,60,30,40,20};
//  Arrays.sort(arr);
//  for(int i=0;i<arr.length-1;i++){
//   for(int j=i+1;j<arr.length;j++){
//    if(arr[i]==arr[j]){
//     System.out.println("Duplicate number is " +arr[j]);
//    }
//   }
//  } 
//------------------------ 
//---------Reverse string-----------------
//public static void main(String[] args) {
//  String s1 = "this is java programme";
//
//  for(int i=s1.length()-1;i>=0;i--){
//   System.out.print(s1.charAt(i)(i));
//  }
// }
//
//-----------------------palindrome--------------------------
//public static void main(String[] args) {  
//  Scanner sc = new Scanner(System.in);
//  System.out.println("Enter word");
//  String str = sc.nextLine();
//  int j = str.length()-1;
//  int size = str.length()-1;
//
//  for (int i=0;i<str.length();i++) {
//   if(str.charAt(i)(i)==str.charAt(j)) {
//    --j;
//    if(i==size) {
//     System.out.println("palindrome");
//    }}
//   else {
//    System.out.println("not palindrome");
//    break;
//   }
//  }
// } 16:31 
//------------Array Sort--------------------- 
//static int temp,i,j;
//
// public static void main(String[] args) {
//  int [] array = {190,15,10,65,91};
//  int n = array.length;
//  for(int i=0;i<n;i++){
//   for(int j=i+1;j<n;j++){
//    if(array[i]>array[j]){
//     temp = array[i];
//     array[i] = array[j];
//     array[j] = temp;
//    }
//   }
//  }
//  for(int i=0;i<n;i++){
//   System.out.print(array[i]+" ");
//  }
//  System.out.println();
//  System.out.println("Largest element in an array  is "+array[n-1]);
//  System.out.println("Second largest element in an array  is "+array[n-2]);
//  System.out.println("Smallest element in an array  is "+array[0]);
// } 
//------------------------Factorial---------------- 16:32 
//static int i;
// static int fact=1;
// static int x=13, y=12,z=8;
//
// public static void factorial(){
//  Scanner input = new Scanner(System.in);
//  System.out.println("Enter integar");
//  int a = input.nextInt();
//  System.out.println("Enter integar "  +a);
//  for(i=1;i<=a;i++)
//  {
//  fact = fact*i;
//  }  
//  System.out.println("factorial is "+fact);
// } 
//Largest number sathi array sort cha ch program a 
