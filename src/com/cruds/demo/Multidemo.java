package com.cruds.demo;

public class Multidemo 
{
public static void main(String[] args)
{
	
	printsal(new Employee());
}
private static void printsal(Object obj)
{
	 if(obj instanceof Director)
	{
		System.out.println("1 lakh sal");
	
	}
	 else if(obj instanceof Manager)
		{
			System.out.println("50k sal");
		}
	 else if (obj instanceof Employee)
	{
		System.out.println("25k sal");
	}	
}
}
