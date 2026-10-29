

    package com.kodewala.interfa;
	
	public interface ILeave
	{
	void calculateLeaveDays(int requestedDays);
	
	public default void showLeavePolicy()
	{
	 System.out.println("Leave policy applied");
	}
	}
	
	class CasualLeave implements ILeave
	{
	 @Override
	 public void calculateLeaveDays(int requestedDays)
	 {
	  System.out.println("Casual leave requested: " + requestedDays);
	 }
	}
	
	class SickLeave implements ILeave
	{
	 @Override
	 public void calculateLeaveDays(int requestedDays)
	 {
	  System.out.println("Sick leave requested: " + requestedDays);
	 }
	}
	
	class LeaveService
	{
	public void applyLeave(ILeave leave, int requestedDays)
	{
	 leave.calculateLeaveDays(requestedDays);
	 leave.showLeavePolicy();
	}
	}
	
	class LeaveManagementSystem
	{
	 public static void main(String[] args)
	{
	 LeaveService leaveService = new LeaveService();
	 leaveService.applyLeave(new CasualLeave(), 2);
	 leaveService.applyLeave(new SickLeave(), 4);
	}
	}
	
	
	