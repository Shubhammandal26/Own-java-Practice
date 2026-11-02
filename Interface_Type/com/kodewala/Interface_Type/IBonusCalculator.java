
   package com.kodewala.types;
   
   @FunctionalInterface
   interface IBonusCalculator 
   {
    double calculateBonus(double salary, int rating);
  }

    class HRManagementSystem 
	{
    public static void main(String[] args) 
	{
       IBonusCalculator bonus = (salary, rating) ->
	   {
		   System.out.println("Employee Salary: " + salary);
	  System.out.println("Performance Rating: " + rating);
	    if (rating == 5)
       {
	    return salary * 20/100;
	   } else if(rating == 4)
	   {
	    return salary * 15/100;
	   } else if(rating == 3)
	   {
	    return salary * 10/100;
	   } else{
	     return 0;
		 }
	   };
	  double result = bonus.calculateBonus(50000, 5);
	  System.out.println("Bonus Amount:" + result);
    }
}