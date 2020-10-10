package com.cruds.demo;

public class Triangle extends Figure {

	Triangle(double dim1, double dim2) {
		super(dim1, dim2);
		
	}

	@Override
	public double area() {
		
		return 0.5*dim1*dim2;
	}

}
