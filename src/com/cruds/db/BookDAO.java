package com.cruds.db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.cruds.demo.Library;



public class BookDAO 
{
public boolean create(Library l)
{
	int rows=0;
	String sql="insert into book(bookid,title,prize) values(?,?,?)";
	try(Connection conn=DBconnectionManager.getConnection())
	{
		PreparedStatement ps=conn.prepareStatement(sql);
		ps.setInt(1,l.getbookid());
		ps.setString(2,l.getTitle());
		ps.setFloat(3, l.getPrize());
		rows=ps.executeUpdate();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return rows>0;
	
}
public List<Library> getBook(String title)
{
	title = "%" + title + "%";
	String sql="select bookid,title,prize from book where title like ?";
	Library l=null;
	List<Library> list =new ArrayList<>();
	try(Connection conn=DBconnectionManager.getConnection())
	{
		PreparedStatement ps=conn.prepareStatement(sql);
		ps.setString(1,title);
		ResultSet rs=ps.executeQuery();
		while(rs!=null && rs.next())
		{
			l=new Library(rs.getInt(1), rs.getString(2), rs.getFloat(3));
			list.add(l);
		}
		
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return list;
	
}
public List<Library> getAllBook()
{
	String sql="select bookid,title,prize from book";
	List<Library> list=new ArrayList<>();
	Library li=null;
	try(Connection conn=DBconnectionManager.getConnection())
	{
		PreparedStatement ps=conn.prepareStatement(sql);
		ResultSet rs=ps.executeQuery();
		while(rs !=null && rs.next())
		{
			  li=new Library(rs.getInt(1),rs.getString(2),rs.getFloat(3));
			list.add(li);
		}
		
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return list;

}
public boolean delete(int bookid)
{
	String sql="delete from book where bookid=?";
	int rows=0;
	try(Connection conn=DBconnectionManager.getConnection())
	{
		PreparedStatement ps=conn.prepareStatement(sql);
		ps.setInt(1,bookid);
		 rows=ps.executeUpdate();
		
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return rows>0;
}

}

