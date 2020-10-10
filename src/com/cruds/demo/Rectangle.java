package com.cruds.demo;

public class Rectangle extends Figure
{

	Rectangle(double dim1, double dim2) {
		super(dim1, dim2);
		
	}

	@Override
	public double area() {
		
		return dim1*dim2;
	}

}
