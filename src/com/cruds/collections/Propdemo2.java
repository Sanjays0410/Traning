package com.cruds.collections;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Propdemo2 {

	public static void main(String[] args) {
		Properties prop=new Properties();
		try {
			prop.load(new FileInputStream("college.properties"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("welocome to" +prop.getProperty("college_name"));
		System.out.println("Best wishes"+prop.getProperty("principal_name"));
	}

}
