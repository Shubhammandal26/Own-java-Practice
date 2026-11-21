package com.koewala.exception5.revision;

public class DriverMatro {

	public static void main(String[] args) 
	{
		MatroMo matrio = new MatroMo();
		
		try 
		{
			matrio.ageVerify(44);
			
		} catch (TooOldException e) 
		{
			e.printStackTrace();
			
		}
		catch (TooYoungException e) 
		{
			e.printStackTrace();
		}
	}

}
