package com.cruds.thread;

public class Mythread extends Thread {

	public Mythread(String name)
	{
		System.out.println(Thread.currentThread() +" cCONST OF MYTHREAD");
		setName(name);
		///start();
	}
		public void run()
		{
			
		System.out.println("inside child Thread" + this);
		for(int i=5;i>0;i--)
		{
			System.out.println(this.getName() +i);
			try {
				Thread.sleep(2500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	
		System.out.println("child Thread exiting" +this);	
		}
	}

