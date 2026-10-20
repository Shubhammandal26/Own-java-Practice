 
 package com.kodewala.overloading;
  
  class Library
  {
  public void displayBook(int bookId)
  {
  System.out.println("Book ID: " + bookId);
  }
  
   public void displayBook(int bookId, String title)
  {
   
   System.out.println("Book ID: " + bookId);
   System.out.println("Book Title: " + title);
  }
  
   public void displayBook(int bookId, String title, String author)
  {
   
   System.out.println("Book ID: " + bookId);
   System.out.println("Book Title: " + title);
   System.out.println("Book Author: " + author);
  }
  }
  
  class LibraryManagementSystem
  {
   public static void main(String[] args)
  {
   Library library = new Library();
   library.displayBook(101);
   library.displayBook(102, "Atomic Habbit");
   library.displayBook(103, "Story Of My Life", "Hellan Killar");
  }
  }  