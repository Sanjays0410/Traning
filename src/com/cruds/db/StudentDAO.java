package com.cruds.db;
import java.util.List;


import java.util.Vector;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.cruds.demo.Student;
import com.cruds.exception.SMSException;
//import com.mysql.jdbc.PreparedStatement;

public class StudentDAO
{
	public Vector<Vector<String>> getAllStudentForJTable()
	{
		String sql="select s.rollno,s.name,a.line1,a.city,a. pin from student s , address a where s.rollno=a.rollno";
		
		Vector<String> row=new Vector<>();
		
		Vector<Vector<String>> data=new Vector<>();
		
		try(Connection conn=DBconnectionManager.getConnection())
		{
			PreparedStatement ps=conn.prepareStatement(sql);
			ResultSet rs=ps.executeQuery();
			while(rs !=null && rs.next())
			{
				row=new Vector<>();
				row.add(String.valueOf(rs.getInt(1)));
				row.add(rs.getString(2));
				row.add(rs.getString(3));
				row.add(rs.getString(4));
				row.add(rs.getString(5));
				data.add(row);
				
			}
		
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return data;
	
		
	}
	
	
	
	

	
public boolean create(Student s)
{
	String sql="insert into student(rollno,name) values(?,?)";
	String addsql="insert into address(line1,city,pin,rollno) values(?,?,?,?)";
	int rows=0,addrows=0;
	try(Connection conn=DBconnectionManager.getConnection())
	{
		PreparedStatement ps=conn.prepareStatement(sql);
		ps.setInt(1, s.getRollno());
		ps.setString(2, s.getName());

		rows=ps.executeUpdate();
		
		ps=conn.prepareStatement(addsql);
		ps.setString(1, s.getAddress().getLine1());
		ps.setString(2, s.getAddress().getCity());
		
		ps.setString(3, s.getAddress().getPin());
		
		ps.setInt(4, s.getRollno());
		
		
		addrows=ps.executeUpdate();
	}catch(SQLException e){
			e.printStackTrace();
			if(e.getMessage().contains("Duplicate"))
			{
				throw new SMSException(s.getRollno() +" already exists! duplicate entry");
			}
			else
			{
				throw new SMSException(e.getMessage() +"please contact system admin");
			}
		}
	return rows>0&& addrows>0;
	}

public Student getStudent(int rollno)
{
	String sql="select rollno,name from student where rollno=?";
	Student s=null;
	try(Connection conn=DBconnectionManager.getConnection())
	{
		PreparedStatement ps=conn.prepareStatement(sql);
		ps.setInt(1, rollno);
		ResultSet rs=ps.executeQuery();
		if(rs!=null && rs.next())
		{
			s=new Student(rs.getInt(1),rs.getString(2), null);
		}
	}
catch(SQLException e){
	e.printStackTrace();
		}
	return s;
	}
public List <Student> getAllStudents()
{
	String sql="select rollno,name from student";
	
	List<Student> list=new ArrayList<>();
	Student s=null;
	try(Connection conn=DBconnectionManager.getConnection())
	{
		PreparedStatement ps=conn.prepareStatement(sql);
		ResultSet rs=ps.executeQuery();
		while(rs !=null && rs.next())
		{
			s=new Student(rs.getInt(1),rs.getString(2), null);
			list.add(s);
		}
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return list;
}
public boolean delete(int rollno)
{
	String sql="delete from student where rollno=?";
	String addsql="delete from address where rollno=?";
	
	int rows=0,addrows=0;
	try(Connection conn=DBconnectionManager.getConnection())
	{
		PreparedStatement ps=conn.prepareStatement(sql);
		ps.setInt(1, rollno);
		rows=ps.executeUpdate();
		
		ps=conn.prepareStatement(addsql);
		ps.setInt(1,rollno);
		addrows=ps.executeUpdate();
		
		
	}
catch(SQLException e){
	e.printStackTrace();
		}
	return rows>0 && addrows>0;
	
}
public boolean update(Student s)
{
	String sql="update student set name=? where rollno=?";
	
	int rows=0;
	try(Connection conn=DBconnectionManager.getConnection())
	{
		PreparedStatement ps=conn.prepareStatement(sql);
		ps.setString(1, s.getName());
		ps.setInt(2, s.getRollno());
		rows=ps.executeUpdate();
		
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return rows>0;
}
}


