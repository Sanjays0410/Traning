package com.cruds.demo;

public class StudentDemo {

	public static void main(String[] args) {
	
		Student[] students=new Student[20];
		
		
		Student s1=new Student(101,"anil",null);
		students[0]=s1;
		
		Student s2=new Student(102,"anil ramesh",null);
		students[1]=s2;
		
		for(Student s :students)
		{
			if(s!=null)
			{
				s.printDetails();
			}
		}
		
		
		
	}

}
