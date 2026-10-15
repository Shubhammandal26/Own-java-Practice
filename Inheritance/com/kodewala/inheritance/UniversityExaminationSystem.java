
   package com.kodewala.inheritance;
   
   class UniversityExaminationSystem
   {
   public static void main(String[] args)
   {
    Result result = new Result("Amit", 101, "Java", 85, 100, 'A');
	result.displayResultDetails();
   }
   }
   
   class Student 
   {
    String studentName;
	int rollNumber;
	Student(String studentName, int rollNumber)
	{
	this.studentName = studentName;
	this.rollNumber = rollNumber;
	}
	public void displayStudentDetails()
	{
	 System.out.println("Student Name: " + studentName);
	 System.out.println("Roll Number: " + rollNumber);
	}
   }
   
   class Exam extends Student
   {
     String subject;
	 int marks;
	 
	 Exam(String studentName, int rollNumber, String subject, int marks)
	 {
	   super(studentName, rollNumber);
	   this.subject = subject;
	   this.marks = marks;
	 }
	 public void displayExamDetails()
	 {
	 super.displayStudentDetails();
	   System.out.println("Subject: " + subject);
	   System.out.println("Marks: " + marks);
	 }
   }
   
   class Result extends Exam
   {
    int totalMarks;
	char grade;
	
	Result(String studentName, int rollNumber, String subject, int marks,int totalMarks, char grade)
	{
	  super(studentName, rollNumber, subject, marks);
	  this.totalMarks = totalMarks;
	  this.grade = grade;
	}
	public void displayResultDetails()
	{
	   super.displayExamDetails();
	   System.out.println("Total Marks: " + totalMarks);
	   System.out.println("Grade: " + grade);
   }
   }