package com.cruds.thread;

public class Clicker implements Runnable 
{
long count;
Thread t;
private volatile boolean running=true;
public Clicker(int priority)
{
	//System.out.println("run method"+ Thread.currentThread());
	t=new Thread(this);
	t.setPriority(priority);
}
	@Override
	public void run()
	{
		System.out.println("run method"+ Thread.currentThread());
while(running)
{
	count++;
}
		
	}
public void stop()
{
	System.out.println("stop method" + Thread.currentThread());
	running =false;
}
}
