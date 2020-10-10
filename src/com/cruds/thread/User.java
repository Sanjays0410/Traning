package com.cruds.thread;

public class User implements Runnable

{
	Printer p;
	String msg;
	Thread t;
	User(Printer printer,String msg)
	{
		t=new Thread(this);
				this.p=printer;
		this.msg=msg;
		t.start();
	}
	@Override
	public void run() {

synchronized (p) {
	p.print(msg);
}
		//p.print(msg);
	}

}
