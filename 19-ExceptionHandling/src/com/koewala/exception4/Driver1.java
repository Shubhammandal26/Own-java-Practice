package com.koewala.exception4;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Driver1 {

	public static void main(String[] args) 
	{
		String fileName = "text.xls";
		
		try (FileOutputStream fos = new FileOutputStream(new File(fileName)))
		{
			String name = "shiv";
			System.out.println(name.charAt(2));
		} 
		catch(FileNotFoundException e)
		{
			e.printStackTrace();
		} 
		catch(IOException e)
		{
			e.printStackTrace();
		}

	}

}
