package com.cruds.collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

import com.cruds.demo.Student;

public class Setdemo {

	public static void main(String[] args) 
	
	{
		Set<Student> students=new TreeSet<>(new StudendNmeComparator());
		students.add(new Student(101,"sada",null));
		 
		students.add(new Student(102,"nikil",null));
		students.add(new Student(105,"sanjau",null));
		
		for(Student s:students)
		{
			s.printDetails();
		}
		
		
		
		
		
		/*Set<String>names=new TreeSet<>();//hashset does not keep order //tree set comes in alphabetical order way
		names.add("anil");
		names.add("sada");
		names.add("sanjay");
		names.add("nis");
		names.add("basker");
		names.add("sanjay");// duplicates not allow
for(String s:names)
{
	System.out.println(s);
}*/
	}
	
	

}
