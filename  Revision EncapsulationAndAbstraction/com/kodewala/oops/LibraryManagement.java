 
    package com.kodewala.oops;
	
	class LibraryBook
	{
	 private String bookTitle;
	 private int availableCopies;
	 private int requestedCopies;
	 
	 LibraryBook(String bookTitle, int availableCopies, int requestedCopies)
	 {
	  this.bookTitle = bookTitle;
	  this.availableCopies = availableCopies;
	  this.requestedCopies = requestedCopies;
	 }
	 
	 private boolean validateRequest()
	 {
	  if(requestedCopies > 0)
	  {
	   return true;
	 } else {
	  return false;
	 }
	 }
	 
	 private boolean checkAvailability()
	 {
	  if(requestedCopies <= availableCopies){
	  return true;
	 } else {
	  return false;
	 }
	 }
	 
	 private int calculateRemainingCopies()
	 {
	  int remCopies = availableCopies - requestedCopies;
	  return remCopies;
	 }
	 
	 public void borrowBook()
	 {
	  if(validateRequest() && checkAvailability())
	  {
	  System.out.println("Book Title: " + bookTitle);
	  System.out.println("Remaining Copies: " + calculateRemainingCopies());
	  } else {
		  System.out.println("Borrowing failed: Invalid request or insufficient copies");
	  }
	 }
	}
	
	class LibraryManagement
	{
	public static void main(String[] args)
	{
	 LibraryBook book = new LibraryBook("Java Programming", 10, 3);
	 book.borrowBook();
	}
	}