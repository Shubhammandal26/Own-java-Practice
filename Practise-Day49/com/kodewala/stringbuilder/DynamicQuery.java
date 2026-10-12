
   package com.kodewala.stringbuilder;
   
   class DynamicQuery
   {
    public static void main(String[] args)
   {
   DynamicQuery dynamic = new DynamicQuery();
   StringBuilder result = dynamic.generateQuery(50000, "Developer");
   System.out.println(result);
   }
   
   public StringBuilder generateQuery(int salary, String department)
   {
    StringBuilder query = new StringBuilder("Select * from employee WHERE 1 = 1");
	
	if(salary > 40000)
	{
	 query.append(" AND salary ").append(salary);
	}
	 if(department != null)
	 {
	 query.append(" AND department = '").append(department).append("'");
	 }
      return query;
   }
   }