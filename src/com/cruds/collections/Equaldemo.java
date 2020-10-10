package com.cruds.collections;  
import com.cruds.demo.Student;

public class Equaldemo {

	public static void main(String[] args)
	{
		Student s1=new Student(101, "sanjay",null);
		Student s2=new Student(101, "sanjay",null);
		s1=s2;
		if(s1==s2){//if memory are same
			System.out.println("s1==s2");
		}
		else if(s1.equals(s2))// if content are same
		{
			System.out.println("s1.equals(s2)");
		}
		else
		{
			System.out.println("null");
		}
		
		
		}

}
