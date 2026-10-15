
  package com.kodewala.inheritance;
  
  class HospitalManagementSystem
  {
   public static void main(String[] args)
  {
   Surgeon surgeon = new Surgeon("Rahul", 35, "DOC101", "Cardiologist", "Heart Surgery", 10);
   surgeon.displaySurgeonDetails();
  }
  }
  
  class Person
  {
   String name;
   int age;
   
   Person(String name, int age)
   {
    this.name = name;
	this.age = age;
   }
   public void displayPersonDetails()
   {
    System.out.println("Name: " + name);
	System.out.println("Age: " + age);
   }
  }
  
  class Doctor extends Person
  {
   String doctorId;
   String specialization;
   
   Doctor(String name, int age, String doctorId, String specialization)
   {
    super(name, age);
	this.doctorId = doctorId;
	this.specialization = specialization;
   }
   public void displayDoctorDetails()
   {
    super.displayPersonDetails();
	System.out.println("Doctor ID: " + doctorId);
	System.out.println("Specialization: " + specialization);
  }
  }
  
  class Surgeon extends Doctor
  {
   String surgeryType;
   int experienceYears;
   
   Surgeon(String name, int age, String doctorId, String specialization,String surgeryType, int experienceYears)
   {
    super(name, age, doctorId, specialization);
	this.surgeryType = surgeryType;
	this.experienceYears = experienceYears;
   }
   public void displaySurgeonDetails()
   {
    super.displayDoctorDetails();
   System.out.println("Surgeon Type: " + surgeryType);
	System.out.println("Experience Years: " + experienceYears);
   }
  }