package com.cruds.db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.cruds.demo.Movies;

public class MoviesDAO
{
public boolean create(Movies m)
{
	int rows=0;
	String sql="insert into movies(movieid,moviename,moviehero,moviedirector,herosal) values(?,?,?,?,?)";
	try(Connection conn=DBconnectionManager.getConnection())
	{
		PreparedStatement ps=conn.prepareStatement(sql);
		ps.setInt(1, m.getMovieid());
		ps.setString(2, m.getMovname());
		ps.setString(3, m.getMovhero());
		ps.setString(4, m.getMovdirector());
		ps.setInt(5,m.getHerosal());
		rows=ps.executeUpdate();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return rows>0;
}
public Movies getmovies(String moviename)
{
	String sql="select movieid,moviename,moviehero,moviedirector,herosal from movies where moviename=?";
	Movies m=null;
			try(Connection conn=DBconnectionManager.getConnection())
			{
				PreparedStatement ps=conn.prepareStatement(sql);
				ps.setString(1, moviename);
				ResultSet rs=ps.executeQuery();
				if(rs!=null&& rs.next())
				{
				  m=new Movies(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getInt(5));
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	return m;
	 
}
public List<Movies> getAllMovie()
{
	
	String sql="select movieid,moviename,moviehero,moviedirector,herosal from movies";
	List<Movies>list=new ArrayList<>();
	Movies m=null;
		try(Connection conn=DBconnectionManager.getConnection())
	{
		PreparedStatement ps=conn.prepareStatement(sql);
		ResultSet rs=ps.executeQuery();
		while(rs !=null && rs.next())
		{
			m=new Movies(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getInt(5)); 
			list.add(m);
		}
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return list;
	
}
public boolean delete(int movieid) 
{
	String sql="delete from movies where movieid=?";
	int rows=0;
	try(Connection conn=DBconnectionManager.getConnection())
	{
		PreparedStatement ps=conn.prepareStatement(sql);
		ps.setInt(1,movieid);
		rows=ps.executeUpdate();
		
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return rows>0;
}

}
