
   package com.kodewala.revision;
   
   class BonusEmployee
   {
   public static void main(String[] args)
   {
   
     EmployeeBonusService bonus = new EmployeeBonusService();
	 
	 PermanentEmployee permanent = new PermanentEmployee();
	 bonus.processBonus(permanent);
	 
	 ContractedEmployee contracat = new ContractedEmployee();
	  bonus.processBonus(contracat);
	  
	 Manager manager = new Manager();
      bonus.processBonus(manager);
   
   }
   }