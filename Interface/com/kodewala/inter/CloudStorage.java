
   package com.kodewala.inter;
   
   class CloudStorage implements IStorage
	{
	@Override
	 public void saveFile(String fileName)
	 {
	 System.out.println("Saving fileName: " + fileName);
	 }
	 
	 @Override
	 public void deleteFile(String fileName)
	 {
	 System.out.println("Delete fileName: " + fileName);
	 }
	
	}