package com.cruds.thread;

public class Threaddemo {

	public static void main(String[] args) 
	{
		System.out.println(Thread.currentThread());
		Thread t=Thread.currentThread();
		t.setName("demo Thread");
		System.out.println(t);
		try{
			Thread.sleep(5000);
		}
		catch (InterruptedException e)
		{
			e.printStackTrace();
		}
System.out.println("main mathod exit");
	}

	
	}


