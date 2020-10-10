package com.cruds.demo;

public class EX3 {

	public static void main(String[] args) {
		try{
			int i=Integer.parseInt(args[0]);
			System.out.println(i);
		}
		catch(NullPointerException e)
		{
			System.out.println("invalid input"+e.getMessage());
		}

	
		catch(RuntimeException e)
		{
			System.out.println(e);
		}
		

}
}
