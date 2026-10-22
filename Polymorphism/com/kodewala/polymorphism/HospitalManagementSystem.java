
   package com.kodewala.polymorphism;
   
   class Doctor
   {
    public void treatPatient()
	{
	System.out.println("Doctor is treating a patient...");
   }
   }
   
   class Surgeon extends Doctor
   {
   @Override
    public void treatPatient()
	{
	System.out.println("Surgeon is treating a patient...");
   }
   public void performSurgery()
   {
    System.out.println("Surgeon is performing surgery...");
   }
   }
   
   class HospitalManagementSystem
   {
    public static void main(String[] args)
   {
       Doctor doctor = new Surgeon(); // upcasting
	   doctor.treatPatient();
	   
	   if(doctor instanceof Surgeon)
	   {
		   Surgeon surgeon = (Surgeon) doctor; // downcasting
		   surgeon.performSurgery();
	   }
   
   }
   }