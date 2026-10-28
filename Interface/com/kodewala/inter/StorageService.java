
  package com.kodewala.inter;
  
  class StorageService
  {
   public void  saveFile(IStorage storage, String fileName)
   {
     storage.saveFile(fileName);
	 
   }
   
   public void  deleteFile(IStorage storage, String fileName)
   {
	 storage.deleteFile(fileName);
   }
    
	public static void main(String[] args)
	{
      StorageService storageService = new StorageService();
	  storageService.saveFile(new LocalStorage(), "shubhampdf");
	  storageService.deleteFile(new CloudStorage(), "shubham");
   }
   }
   