package com.cruds.thread;

public class Threaddemo2 {

	public static void main(String[] args) {
		System.out.println("main Thread start");
		 Mythread t1 =new Mythread("child1 ");
		 t1.start();
		/* Mythread t2 =new Mythread("child2 ");
		 t2.start();*/
		 MythreadR rt=new MythreadR("rt1");
		 rt.t.start();
		 try {
			t1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 

		 
		System.out.println("main thread exit");
	}

}
