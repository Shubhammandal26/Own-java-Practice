

  package com.kodewala.types;
  
  interface IPerformanceEvaluator
  {
   String evaluatePerformance(int score);
  }
  
  class  PerformanceEvaluator
  {
  public static void main(String[] args)
  {
  
   IPerformanceEvaluator   performance = (marks) ->
   {
   System.out.println("Employee Score: " + marks);
    if(marks >= 90 && marks <= 100)
	{
	 return "Excellent";
	} else if(marks >= 75 && marks < 90)
	{
	 return "Very Good";
	} else if(marks >= 60 && marks < 75)
	{
	 return "Good";
	} else if(marks >= 40 && marks < 60)
	{
	 return "Average";
	} else if(marks >= 0 && marks < 40)
	{
	 return "Poor";
	} else {
	  return "Invalid Score";
	}
  };
   String  progress = performance.evaluatePerformance(85);
   System.out.println("Performance Category: " + progress);
  }
  }