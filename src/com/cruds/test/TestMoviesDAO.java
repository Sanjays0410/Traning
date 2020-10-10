package com.cruds.test;

import static org.junit.Assert.*;

import org.junit.Ignore;
import org.junit.Test;

import com.cruds.db.MoviesDAO;
import com.cruds.demo.Movies;

public class TestMoviesDAO {

	@Test
	@Ignore
	public void testcreate() {
		MoviesDAO dao=new MoviesDAO();
		Movies m=new Movies(001, "Appu", "punnethrajkumar", "upendra", 100000);
		assertTrue(dao.create(m));
	}
	@Test
	@Ignore
	public void  testgetmovies()
	{
		MoviesDAO dao=new MoviesDAO();
		assertNotNull(dao.getmovies(null));
		
	}
	@Test
	@Ignore
	public void testgetAllmovies()
	{
		MoviesDAO dao=new MoviesDAO();
		assertNotNull(dao.getAllMovie());
	}
	@Test
@Ignore
	public void testdelete()
	{
		MoviesDAO dao=new MoviesDAO();
		assertTrue(dao.delete(0));
	}
	
	
}