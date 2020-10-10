package com.cruds.collections;

import java.util.Vector;

public class Vectordemo {

	public static void main(String[] args) {
		Vector<String>names=new Vector<>();
		names.add("sada");
		names.add("sanjay");
		for (String s:names)
		{
			System.out.println(s);
		}
	}

}
