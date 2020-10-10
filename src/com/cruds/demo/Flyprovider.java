package com.cruds.demo;

public class Flyprovider 
{
	public static Ifly getfly(String type)
	{
	
		if (type.equals( Ifly.TYPE_SUPERMAN))
		{
		return new Superman();

		}
		else if(type.equals(Ifly.TYPE_BIRDS))
		{
			return new Birds();
		}
		else if(type.equals(Ifly.TYPE_FLIGHT))
		{
			return new Flight();
		}
		else 
		{
			return null;
		}
	}
	
}