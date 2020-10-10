package com.cruds.demo;

public class Animalprovider {
	public static Animal getAnimal( String type)
	{
		if(type.equals("faithfull"))
		{
			return new Dog();
		}
		else if(type.equals("cunning"))
		{
			return new Cat();
		}
		else if(type.equals("javalub"))
		{
			return new San();
		}
		else
		{
			return null;
		}
		
	}

}
