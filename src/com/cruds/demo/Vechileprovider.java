package com.cruds.demo;

public class Vechileprovider 
{
	public static Ivechile2 getVechile (String type)
	{
		if (type.equals(Ivechile2.TYPE_LUXURY))
	{
		return new Car();
	}
	else if(type.equals(Ivechile2.TYPE_PASSENGER))
	{
		return new Bus();
	}
	
	else if(type.equals(Ivechile2.TYPE_FAITHFUL))
	{
		return new Dog();
	}
		
	else if(type.equals(Ivechile2.TYPE_LOADSS))
	{
		return  new Truck();
	}
	
		else 
		{
			return null;
		}
}
}
