package com.cruds.demo;

public class EX2 {

	public static void main(String[] args) {
		try{
			int i=Integer.parseInt(args[0]);
					System.out.println(i);
		}
		//System.out.println("we cannot print anycode inbetween try catch finally block");
		catch(NumberFormatException e)
		{
			System.out.println(e);
		}

	}

}
