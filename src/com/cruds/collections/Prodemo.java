package com.cruds.collections;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class Prodemo {

	public static void main(String[] args) {
		Properties prop=new Properties();
		prop.put("kar", "BLR");
		prop.put("tn", "csk");
	//	prop.put("kar", "BLR");
		System.out.println(prop.get("kar"));
		
		System.out.println(prop.getProperty("mh","notfound"));
		
		//in values space is not allow but in values it allow
		try {
			prop.store(new FileOutputStream("capitals.properties"),"state capitals info");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	

}
