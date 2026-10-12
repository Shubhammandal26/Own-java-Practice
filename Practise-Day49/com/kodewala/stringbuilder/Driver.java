
   package com.kodewala.stringbuilder;
   
   class Driver
   {
    public static void main(String[] args)
   {
    Driver driver = new Driver();
	StringBuilder res = driver.generateQuery(0, "emp123");
	System.out.println(res);   
   }
   
   public StringBuilder generateQuery(int salary, String empID)
   {
   StringBuilder sb = new StringBuilder("Select * from employee");
   
    if(salary > 0) 
	{
	 sb.append("where salary = " + salary + ";");
	}
   
   if(empID != null)
   {
    sb.append("where empID = " + empID + ";");
   }
   return sb;
   }
   }