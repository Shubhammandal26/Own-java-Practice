  
    package com.kodewala.oops;
	
	class LibraryManagementSystem
	{
	 public static void main(String[] args)
	{
	LibraryDetail library = new LibraryDetail("Java", "JA123", "James Ghoshling", True);
	System.out.println(library.getBookName());
	System.out.println(library.getAuthor());
	System.out.println(library.isAvailable());
	System.out.println(library.borrowBook());
	System.out.println(library.returnBook());
	}
	}
	
	class LibraryDetail
	{
	private String bookTitle;
	private String bookID;
	private String author;
	private boolean available;
	
	public  LibraryDetail(String bookTitle,String bookID,String author,boolean available)
	{
	  this.bookTitle = bookTitle;
	  this.bookID = bookID;
	  this.author = author;
	  this.available = available;
	}
	
	public void getBookName()
	{
	 return bookTitle;
	}
	
	public void getAuthor()
	{
	 return author;
	}
	
	public void isAvailable()
	{
	  return available;
	}
	
	public void borrowBook()
	{
	if(available){
	available = false;
	System.out.println("Book borrowed successfully");
	} else {
	System.out.println("Book is not available");
	}
	}
	
	public void returnBook()
	{
	if(!available){
	 available = true;
	 System.out.println("Book return successfully");
	} else {
	System.out.println("Book has not been borrowed");
	}
	}
	
	}
	
	