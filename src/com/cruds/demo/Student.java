package com.cruds.demo;

import java.io.Serializable;

import com.cruds.exception.SMSException;

public class Student implements Serializable,Comparable<Student>
{
	
	private int rollno;
	private String name;
	
	private String branch;
	
	
	private Address address;//aggregete relationship
	
	public Student(int rollno, String name,Address ad) {
		super();
		this.rollno = rollno;
		this.name = name;
		//this.branch=branch;
		this.address = ad;
	}
	
	public String getBranch() {
		return branch;
	}


	public void setBranch(String branch) {
		this.branch = branch;
	}


	public Address getAddress() {
		return address;
	}


	public void setAddress(Address address) {
		this.address = address;
	}

	public void setRollno(int roll)
	{
		this.rollno=roll;
		
	}
	
	public int getRollno()
	{
		return rollno;
	}
	
	public void setName(String name)
	{
		this.name=name;
	}
	
	public String getName()
	{
		return name;
	}
	public void setbranch( String branch)
	{
		this.branch=branch;
		
	}
	public String getbranch()
	{
		return branch;
	}

	public void printDetails()
	{
		System.out.println("rollno :" +rollno +" name :" +name +" branch:" +branch);
	}
	
	

	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + ", address=" + address + "]";
	}


	@Override
	public int compareTo(Student o) {
		
		//return o.getRollno()-this.rollno;
		return this.rollno - o.getRollno() ;
	}


	}

