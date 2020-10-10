package com.cruds.file;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

import com.cruds.demo.Student;

public class ObjectInputdemo {

	public static void main(String[] args)
	{

try(ObjectInputStream is=new ObjectInputStream(new FileInputStream("student.ser")))
{
	Student s=(Student) is.readObject();
	System.out.println(s);


} catch (FileNotFoundException e) {
	e.printStackTrace();
}catch (IOException e) {
	e.printStackTrace();
} catch (ClassNotFoundException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}

	}
}



