package com.cruds.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Listdemo {

	public static void main(String[] args) {
		List<String> names=new LinkedList<>();
		names.add("sada");
		names.add("sanjay");
		names.add(1,"nikil");//positinal insert
		//System.out.println(names.get(2));//positional access
		
		Iterator<String> iter=names.iterator();
				while(iter.hasNext())
				{
					System.out.println(iter.next());
				}
		
		
		
		
	/*	for(int i=0;i<names.size();i++)
		{
			System.out.println(names.get(i));
		}
for(String s:names){
	System.out.println(s);
}
	}*/

}
}
