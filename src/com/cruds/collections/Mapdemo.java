package com.cruds.collections;


import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Mapdemo {

	public static void main(String[] args) {
		 Map<Integer, String> studMap=new HashMap<>();
		 studMap.put(101,"sada");
		 studMap.put(102,"sanjay");
		 studMap.put(103,"kiran");
		 studMap.put(101,"sunil");//keys will be unique //collection will be replace 
		 
		 
		 Set<Entry<Integer,String>> entries=studMap.entrySet();
		 
		 
		 //important for how to retrive key and values
		 for(Entry<Integer,String>e :entries)
		 {
			 System.out.println(e.getKey()+ ":"+e.getValue());
		 }
		 
		 
		 
		 
		/* Collection<String>names=studMap.values();
		 for(String s:names)
		 {
			 System.out.println(s);
		 }
		 Set<Integer> keys=studMap.keySet();
		 for(int i:keys)
		 {
			 System.out.println(i);
		 }

		 //System.out.println(studMap.get(101));  */
	}

}
