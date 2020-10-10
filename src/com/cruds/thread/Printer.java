package com.cruds.thread;

public class Printer
{
public   void print(String msg)
{
	System.out.print("[" +msg);
	try {
		Thread.sleep(250);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	System.out.println("]");
}
}
