package com.cruds.demo;

import com.cruds.db.StudentDAO;

public class TestStudent 
{

		public static void main(String[] args)
		{
		Address ad=new Address("cr street", "tumkur","572101");
		Student s=new Student(99,"anu",ad);
		StudentDAO dao=new StudentDAO();
		dao.create(s);
		
		//System.out.println(s);
		}
}
		
