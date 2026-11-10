package com.revision.oops;

class MobileRecharge
{
	public boolean recharge(String mobileNumber, double amount, boolean operatorAvailable)
	{
		if(validateMobileNumber(mobileNumber) && validateRechargeAmount(amount) && checkOperatorAvailability(operatorAvailable))
		{
		System.out.println("Recharge successful!");
		return true;
		} else {
			System.out.println("Recharge not successusful");
			return false;
		}
	}
	private boolean validateMobileNumber(String mobileNumber)
	{
	 if(mobileNumber != null && mobileNumber.length() == 10)  // if (mobileNumber != null && mobileNumber.matches("[0-9]{10}")
	 {
		 System.out.println("Validating mobile number...");
		 return true;
	 } else {
		 System.out.println("Invalide mobile number...");
		 return false;
	 }
	}
	
	private boolean validateRechargeAmount(double amount)
	{
		if(amount > 0)
		{
			System.out.println("Validating recharge amount...");
			return true;
		} else {
			System.out.println("Recharge amount not available...");
			return false;
		}
	}
	
	private boolean checkOperatorAvailability(boolean operatorAvailable)
	{
		if(operatorAvailable)
		{
			System.out.println("Checking operator availability....");
			return true;
		} else {
			System.out.println("Operator is not available..");
			return false;
		}
	}
}
public class MobileRechargeSys {

	public static void main(String[] args) 
	{
		MobileRecharge recharge = new MobileRecharge();
		recharge.recharge("7891230456", 199, true);

	}

}
