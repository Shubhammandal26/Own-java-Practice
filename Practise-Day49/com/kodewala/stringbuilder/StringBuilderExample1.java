package com.kodewala.stringbuilder;
  
  class StringBuilderExample1
  {
   public static void main(String[] args)
  {
   StringBuilder sb = new StringBuilder("Kodewala");
   for(int i = 0; i < 10; i++)
   {
   sb.append(" Academy"+ i); // same object is being modified. now new object  created
   }
   System.out.println(sb); // Kodewala Academy
  
  }
  }