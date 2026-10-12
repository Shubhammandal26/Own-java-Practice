
  package com.kodewala.stringbuilder;
  
  class DynamicSqlQueries
  {
   public static void main(String[] args)
  {
    DynamicSqlQueries query = new DynamicSqlQueries();
	StringBuilder result = query.queryGenerator();
	System.out.println(result);
  
  }
  public StringBuilder queryGenerator()
  {
  StringBuilder sb = new StringBuilder("Select * From employee Where 1= 1");
  boolean filterByDepartment = true;
  
  if(filterByDepartment)
  {
  sb.append(" AND department = 'IT'");
  }
  boolean filterBySalary = true;
  
  if(filterBySalary)
  {
  sb.append(" AND salary > 5000");
  }
  return sb;
  }
  }