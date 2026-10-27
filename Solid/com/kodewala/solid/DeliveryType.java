
  package com.kodewala.solid;
  
   // Open for existing and Closed for modification 
   // using polymorphism in which a class can extends but cannot modify any classes
   // use the concept of method overloading which means a method can have same name but different parameter (order of pars, no. of pars , types of pars)
  
 class DeliveryType
 {
 public void doDeliver()
 {
 System.out.println("DeliveryType.doDeliver()... DeliveryType");
  }
  }

  class ExpressBee extends DeliveryType
  {
   @Override
  public void doDeliver()
   {
  System.out.println("ExpressBee.doDeliver()... ExpressBee"); 
  }
   }  
   
   class Ekart extends DeliveryType
  {
   @Override
  public void doDeliver()
   {
  System.out.println("Ekart.doDeliver()... Ekart"); 
  }
   }  
   
   class Minutes extends DeliveryType
  {
   @Override
  public void doDeliver()
   {
  System.out.println("Minutes.doDeliver()... Minutes"); 
  }
   }  