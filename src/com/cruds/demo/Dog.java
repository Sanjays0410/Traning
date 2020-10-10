package com.cruds.demo;

public class Dog extends Animal implements Ivechile2 
{
	@Override
	public void talk() {
		// TODO Auto-generated method stub
		super.talk();
		System.out.println("dogg");
	}
	public void racktail()
	{
		System.out.println("rachtail");
	}
	@Override
	public void start() {
		System.out.println("dog starts");
		// TODO Auto-generated method stub
		
	}
	@Override
	public void stop() {
		System.out.println("dog stops");
		// TODO Auto-generated method stub
		
	}
	@Override
	public void brake() {
		// TODO Auto-generated method stub
		
	}

}
