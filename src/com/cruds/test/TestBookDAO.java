package com.cruds.test;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Ignore;
import org.junit.Test;

import com.cruds.db.BookDAO;
import com.cruds.demo.Library;

public class TestBookDAO {

	@Test
	@Ignore
	public void testCreate() {
		BookDAO  dao=new BookDAO();
		Library L=new Library(88,"J2EE",1500);
		assertTrue(dao.create(L));
	}
	@Test
	
	public void testget()
	{
		BookDAO  dao=new BookDAO();
		assertNotNull(dao.getBook(null));
		
	}
	@Test
@Ignore
	public void testAllget()
	{
		BookDAO dao=new BookDAO();
		List<Library> list=dao.getAllBook();
		assertTrue(list.size()>0);
	}
	@Test
	
	public void testdel()
	{
		BookDAO dao=new BookDAO();
		assertNotNull(dao.delete(0));
	}
	

}
