package com.cruds.thread;

public class Prioritydemo
{
	public static void main(String[] args)
	{
		Thread.currentThread().setPriority(Thread.MAX_PRIORITY -1);
		Clicker hi=new Clicker(Thread.NORM_PRIORITY +2);
		Clicker low=new Clicker(Thread.NORM_PRIORITY -2);
		low.t.start();
		hi.t.start();
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
low.stop();
hi.stop();
System.out.println("HIGH COUNTER" + hi.count);
System.out.println("LOW COUNTER" + low.count);
	}

}
