package com.cruds.demo;

public class Address 
{
private int id;
private String line1;
private String city;
private String pin;
public Address(String line1, String city, String pin) {
	super();
	this.line1 = line1;
	this.city = city;
	this.pin = pin;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getLine1() {
	return line1;
}
public void setLine1(String line1) {
	this.line1 = line1;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public String getPin() {
	return pin;
}
public void setPin(String pin) {
	this.pin = pin;
}
@Override
public String toString() {
	return "Address [line1=" + line1 + ", city=" + city + ", pin=" + pin + "]";
}





}
