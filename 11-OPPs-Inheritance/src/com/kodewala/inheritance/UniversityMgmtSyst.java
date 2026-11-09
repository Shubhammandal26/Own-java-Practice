package com.kodewala.inheritance;

class UniversityMember
{
	String universityName;
	String memberId;
	
	public UniversityMember(String universityName, String memberId) 
	{
		this.universityName = universityName;
		this.memberId = memberId;
	}
	public void displayRole()
	{
		System.out.println("University Name: " + universityName);
		System.out.println("Member ID: " + memberId);
	}
}

class Student extends UniversityMember
{
    String courseName;
	public Student(String universityName, String memberId,String courseName) {
		super(universityName, memberId);
		this.courseName = courseName;
	}
	@Override
	public void displayRole()
	{
		super.displayRole();
		System.out.println("Course Name: " + courseName);
	}
}

class Professor extends UniversityMember
{
     String subjectName;
	public Professor(String universityName, String memberId,String subjectName)
	{
		super(universityName, memberId);
		this.subjectName = subjectName;
	}
	@Override
	public void displayRole()
	{
		super.displayRole();
		System.out.println("Subject Name: " + subjectName);
	}
}

class Admin extends UniversityMember
{
    String department;
	public Admin(String universityName, String memberId,String department)
	{
		super(universityName, memberId);
		this.department = department;
	}
    @Override
	public void displayRole()
	{
		super.displayRole();
		System.out.println("Admin Department: " + department);
	}	
}


public class UniversityMgmtSyst 
{
	public static void main(String[] args) 
	{
     UniversityMember student = new Student("BPUT", "210123", "B.Tech");
     student.displayRole();
     
     UniversityMember prof = new Professor("BPUT", "1452", "DBMS");
     prof.displayRole();
     
     UniversityMember admin = new Admin("BPUT", "7896", "Management");
     admin.displayRole();

	}

}
