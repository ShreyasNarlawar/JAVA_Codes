package com.demo.beans;

public class Rectangle extends Shape {
	private float length,width;

	public Rectangle() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Rectangle(String c,float length, float width) {
		super(c);
		this.length = length;
		this.width = width;
	}

	public float getLength() {
		return length;
	}

	public void setLength(float length) {
		this.length = length;
	}

	public float getwidth() {
		return width;
	}

	public void setwidth(float width) {
		this.width = width;
	}

	@Override
	public String toString() {
		return super.toString()+"Rectangle [length=" + length + ", width=" + width + "]";
	}

	@Override
	public float calc_Area() {
		// TODO Auto-generated method stub
		return length*width;
	}

	@Override
	public float calc_Perimeter() {
		// TODO Auto-generated method stub
		return (length + width)*2;
	}
	
	

}
