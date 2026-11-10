package com.revision.oops;

class LibraryManagement
{
	public boolean issueBook(String memberName,String bookName, boolean bookAvailable, double pendingFine)
	{
		if(validateMember(memberName) && checkBookAvailability(bookAvailable) && checkPendingFine(pendingFine))
		{
		System.out.println("Book issued successfully...");
		return true;
	} else {
		System.out.println("Book not issued...");
	  return false;	
	}
	}
	
	private boolean validateMember(String memberName)
	{
		if(memberName != null && !memberName.trim().isEmpty()) 
		{
			System.out.println("Validating library member...");
		return true;
	} else {
		System.out.println("Not a library member...");
		return false;
	}
}
	
	private boolean checkBookAvailability(boolean bookAvailable)
	{
		if(bookAvailable)
		{
			System.out.println("Checking book availability...");
		return true;
	} else {
	 System.out.println("Book not available");
	 return false;
	}
	}
	
	private boolean checkPendingFine(double pendingFine)
	{
		 if(pendingFine == 0.0)
		 {
			 System.out.println("Checking pending fine...");
			 return true;
		 } else {
			 System.out.println("Pending must be cleared!");
			 return false;
		 }
	}
}
public class LibraryMgmtSystem {

	public static void main(String[] args) 
	{
		LibraryManagement library = new LibraryManagement();
		boolean status = library.issueBook("Shivam", "Apatch Kafka", true, 0.0);
		System.out.println("Book issue status: " + status);

	}

}
