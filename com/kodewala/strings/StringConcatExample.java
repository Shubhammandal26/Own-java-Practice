
  package com.kodewala.strings;
  
  class StringConcatExample
  {
   public static void main(String[] args)
  {
   String s1 = "Java";
   s1.concat(" Backend");
   System.out.println(s1); 
   // The output will be Java because string is immutable in java.The concat() method return the  combined the content 
 //   in the concat method there is no variable point,so the string return the original string   
  }
  }