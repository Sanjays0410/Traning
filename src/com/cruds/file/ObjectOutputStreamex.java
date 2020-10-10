package com.cruds.file;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import com.cruds.demo.Student;

public class ObjectOutputStreamex
{
public static void main(String[] args)
{
	Student s1=new Student(101,"sada", null);
	 try(ObjectOutputStream os=new ObjectOutputStream(new FileOutputStream("student.ser")))
	 {
		 os.writeObject(s1);
		 System.out.println("student data saved");
	 }catch (FileNotFoundException e) {
		e.printStackTrace();
	}catch (IOException e) {
		e.printStackTrace();
	}
}
}
