package com.cruds.demo;


public  abstract class Sand
{
	    abstract  void run();
	}
	 class Bike extends Sand
	{
	    void run()
	    {
	        System.out.println("bikes run");
	    }
	}
	
	 class Demo
	{
	     public static void main(String []args)
	     {
	         Sand v=new Bike();
	        
	         v.run();
	        
	     }
	}


