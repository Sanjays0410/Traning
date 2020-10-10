package com.cruds.test;

import static org.junit.Assert.*;


import java.util.List;

import org.junit.Ignore;
import org.junit.Test;

import com.cruds.db.StudentDAO;
import com.cruds.demo.Student;

public class TestStudentDAO {

	@Test
@Ignore
	public void test() 
	{
		StudentDAO  dao=new StudentDAO();
		Student s=new Student(206,"testing", null);
		assertTrue(dao.create(s));
	}
	
	@Test
	@Ignore
	public void testCreate()
	{
		StudentDAO dao=new StudentDAO();
		Student s=new Student(99, "sada", null);
		assertTrue(dao.create(s));
		/*Student result=dao.getStudent(999);
		assertNotNull(s);
		assertEquals(result.getName(), "sada");
		assertTrue(dao.delete(999));
		*/
	}
	@Test
	@Ignore
	public void  testget()
	{
		StudentDAO dao=new StudentDAO();
		assertNotNull(dao.getStudent(0));
	}
	@Test
	@Ignore
	public void testGetall()
	{
		StudentDAO dao=new StudentDAO();
		List<Student> list=dao.getAllStudents();
		assertTrue(list.size()>0);
	}
	@Test
	@Ignore
	public void testdel()
	{
		StudentDAO dao=new StudentDAO();
		assertNotNull(dao.delete(0));
	}
	@Test
	@Ignore
	public void testup()
	
	{
		StudentDAO dao=new StudentDAO();
		Student s=new Student(101,"sanjay", null);
		assertNotNull(dao.update(s));
	}
	
	
	

}
