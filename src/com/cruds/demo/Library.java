package com.cruds.demo;

public class Library 
{
int bookid;
String title;
float prize;
public Library(int bookid, String title, float prize) {
	super();
	this.bookid = bookid;
	this.title = title;
	this.prize = prize;
}
public int getbookid() {
	return bookid;
}
public void setbookid(int bookid) {
	this.bookid = bookid;
}
public String getTitle() {
	return title;
}
public void setTitle(String title) {
	this.title = title;
}
public float getPrize() {
	return prize;
}
public void setPrize(float prize) {
	this.prize = prize;
}
@Override
public String toString() {
	return "Book [bookid=" + bookid + ", title=" + title + ", prize=" + prize + "]";
}


}
