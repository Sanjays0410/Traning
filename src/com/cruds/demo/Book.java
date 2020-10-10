package com.cruds.demo;

public class Book {
	private int bookno;
	private String bookname;
	
	public Book(int bookno,String bookname)
	{
		this.bookno=bookno;
		this.bookname=bookname;
	}
	public void setbookno(int bookno)
	{
		this.bookno=bookno;
		
	}
public int getbookno()
{
	return bookno;
}
public void setbooknname(String bookname)
{
	this.bookname=bookname;
	
}
public String getbookname()
{
return bookname;
}
public void printDetails()
{
	System.out.println("bookno :" +bookno +" \tbookname :" +bookname);
}

@Override
public String toString() {
	
	return "Student [bookno=" + bookno +",bookname=" +bookname + "]";
}

}
