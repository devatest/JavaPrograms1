package com.static_parent;

public class Orange extends Apple
{
  String color = "White";
  
  void printfruits()
  {     
 	 System.out.println(color);  // print color of orange class
 	 System.out.println(super.color);  // print color of Apple class
  } 

}

 