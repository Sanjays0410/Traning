package com.cruds.demo;

public class Calculator {

	 public int div( int x,int y)
	 {
		 int result=0;
		 int[] num=new int[3];
		 Student s=null;
		 try{
			 System.out.println(s.getRollno());
		 num[3]=99;
		 System.out.println("before division ");
	
		 result=x/y;
		 System.out.println("after division");
		 }
		 catch(NullPointerException n)
		 {
			 System.out.println("null pointer"+n.getMessage());
		 }
		 catch(ArithmeticException e)
		 {
			 System.out.println("cannot divide by zero");
		 
			 
		 }
		 catch(ArrayIndexOutOfBoundsException ae)
		 {
			 System.out.println("invalid index"+ ae.getMessage());
		 }
		 finally {
			System.out.println("inside finally block");
		
			//num[4]=100;
			
			System.out.println("inside final block line2");
		}
		 
		 return result;
	}

}
