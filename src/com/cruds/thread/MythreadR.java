package com.cruds.thread;

public class MythreadR implements Runnable
{
	Thread t;
	public MythreadR(String name)
	{
		t=new Thread(this,name);
	}

	@Override
	public void run() {
		System.out.println("inside child Thread" + Thread.currentThread());
		for(int i=5;i>0;i--)
		{
			System.out.println(Thread.currentThread() + " " +i);
			try {
				Thread.sleep(2500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

}
