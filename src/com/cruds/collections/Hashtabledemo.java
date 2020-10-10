package com.cruds.collections;
// sikappatteee important foe interview 
import java.util.HashMap;
import java.util.Hashtable;

public class Hashtabledemo {

	public static void main(String[] args) {
		Hashtable<Integer,String> ht=new Hashtable<>();
		ht.put(101, "sada");
		//ht.put(null, "xyz");  //hashtable does not allow null keys
		System.out.println(ht.get(101));
		HashMap<Integer, String> hm=new HashMap<>();
		hm.put(103, "sanjay");
		hm.put(null, "kiran");//hashmap allow null keys
		System.out.println(hm.get(null));
		
		
		
		
	}

}
