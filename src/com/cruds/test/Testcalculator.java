package com.cruds.test;

import com.cruds.demo.Calculator;

public class Testcalculator 
{

	public static void main(String[] args)
	{
		int result=0;
		Calculator c=new Calculator();
		System.out.println("before calculation");
		result=c.div(4,0);
		System.out.println("after calculation");
		System.out.println(result);

	}

}
